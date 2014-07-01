package org.ailab.fetch;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.ailab.cache.FetchShengfurecQuery;
import org.ailab.cache.SeedUrl;
import org.ailab.model.Chang;
import org.ailab.util.BasicJsoupDocumentUtil;
import org.ailab.util.HandleFetchShengfurecRes;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class FetchShengfurec {

	private HandleFetchShengfurecRes handleFetchShengfurecRes;

	/**
	 * ��ȡ������elementԪ��
	 * 
	 * @return
	 */
	public Element getBetContent() {
		Document document = BasicJsoupDocumentUtil
				.getDocument(SeedUrl.SHENGFU_URL);

		Element eleBetContent = document.select(
				FetchShengfurecQuery.BET_CONTENT_QUERY).first();
		return eleBetContent;
	}

	/**
	 * �������һ�������
	 * 
	 * @param eleBetContent
	 * @return
	 */
	public Elements getAllDayContent(Element eleBetContent) {
		Elements elesAllDayContent = eleBetContent
				.select(FetchShengfurecQuery.BET_ONEDAY_QUERY);

		return elesAllDayContent;
	}

	/**
	 * ���һ�쵱�е����б�������
	 * 
	 * @param eleEachDayContent
	 * @return
	 */
	public Elements getAllBetContentInDay(Element eleEachDayContent) {
		Elements elesAllBetContentInDay = eleEachDayContent
				.select(FetchShengfurecQuery.BET_ELEMENT_QUERY);

		return elesAllBetContentInDay;
	}

	/**
	 * ��ȡÿ�����ʼ�¼
	 */
	public void fetchAllBetContent() {
		Element eleBetContent = this.getBetContent();

		Elements elesAllDayContent = this.getAllDayContent(eleBetContent);
		for (Element eleEachDayContent : elesAllDayContent) {

			// System.out.println(eleEachDayContent);

			Elements elesAllBetContentInDay = this
					.getAllBetContentInDay(eleEachDayContent);

			for (Element eleEachBetContentInDay : elesAllBetContentInDay) {

				// System.out.println(eleEachBetContentInDay);

				String strMatchTime = eleEachBetContentInDay.select(
						FetchShengfurecQuery.BET_TIME_QUERY).first().attr(
						"pendtime");
				String hostTeamName = eleEachBetContentInDay.select(
						FetchShengfurecQuery.BET_HOST_QUERY).first().attr(
						"title");
				String guestTeamName = eleEachBetContentInDay.select(
						FetchShengfurecQuery.BET_GUEST_QUERY).first().attr(
						"title");

				Chang chang = this.handleFetchShengfurecRes.handleChangContent(
						strMatchTime, hostTeamName, guestTeamName);
				if (chang == null) {
					continue;
				}

				Element eleRang0Content = eleEachBetContentInDay.select(
						FetchShengfurecQuery.RANG0_ELEMENT_QUERY).first();
				Element eleRang1Content = eleEachBetContentInDay.select(
						FetchShengfurecQuery.RANG1_ELEMENT_QUERY).first();

				int rang0 = 0;
				double rang0s = Double.valueOf(eleRang0Content.select(
						FetchShengfurecQuery.S_DATA_QUERY).first().ownText());
				double rang0p = Double.valueOf(eleRang0Content.select(
						FetchShengfurecQuery.P_DATA_QUERY).first().ownText());
				double rang0f = Double.valueOf(eleRang0Content.select(
						FetchShengfurecQuery.F_DATA_QUERY).first().ownText());
				int rang1 = -1;
				double rang1s = Double.valueOf(eleRang1Content.select(
						FetchShengfurecQuery.S_DATA_QUERY).first().ownText());
				double rang1p = Double.valueOf(eleRang1Content.select(
						FetchShengfurecQuery.P_DATA_QUERY).first().ownText());
				double rang1f = Double.valueOf(eleRang1Content.select(
						FetchShengfurecQuery.F_DATA_QUERY).first().ownText());
				String strCrawlTime = new SimpleDateFormat(
						"yyyy-MM-dd HH:mm:ss").format(new Date());

				this.handleFetchShengfurecRes.handleRecContent(chang
						.getChangId(), rang0, rang0s, rang0p, rang0f,
						strCrawlTime);
				this.handleFetchShengfurecRes.handleRecContent(chang
						.getChangId(), rang1, rang1s, rang1p, rang1f,
						strCrawlTime);
			}
		}
	}

	public HandleFetchShengfurecRes getHandleFetchShengfurecRes() {
		return handleFetchShengfurecRes;
	}

	public void setHandleFetchShengfurecRes(
			HandleFetchShengfurecRes handleFetchShengfurecRes) {
		this.handleFetchShengfurecRes = handleFetchShengfurecRes;
	}

}
