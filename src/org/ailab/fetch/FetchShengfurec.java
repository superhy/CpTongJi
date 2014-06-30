package org.ailab.fetch;

import org.ailab.cache.FetchShengfurecQuery;
import org.ailab.cache.SeedUrl;
import org.ailab.util.BasicJsoupDocumentUtil;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class FetchShengfurec {

	public Element getBetContent() {
		Document document = BasicJsoupDocumentUtil
				.getDocument(SeedUrl.SHENGFU_URL);

		Element eleBetContent = document.select(
				FetchShengfurecQuery.BET_CONTENT_QUERY).first();
		return eleBetContent;
	}
}
