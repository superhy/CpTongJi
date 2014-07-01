package org.ailab.util;

import java.sql.Timestamp;
import java.util.HashMap;
import java.util.Map;

import org.ailab.model.Chang;
import org.ailab.model.Shengfurec;
import org.ailab.model.Team;
import org.ailab.service.ChangService;
import org.ailab.service.ShengfurecService;
import org.ailab.service.TeamService;

public class HandleFetchShengfurecRes {

	private TeamService teamService;
	private ChangService changService;
	private ShengfurecService shengfurecService;

	public Chang handleChangContent(String strMatchTime, String hostTeamName,
			String guestTeamName) {

		Timestamp matchTime = Timestamp.valueOf(strMatchTime);
		Map<String, Object> teamTimeMap = new HashMap<String, Object>();
		teamTimeMap.put("matchTime", matchTime);
		teamTimeMap.put("hostTeamName", hostTeamName);
		teamTimeMap.put("guestTeamName", guestTeamName);

		Chang changCheck = this.changService
				.loadByTeamAndMatchTime(teamTimeMap);
		if (changCheck == null) {

			Team hostTeam = this.teamService.loadByTeamName(hostTeamName);
			Team guestTeam = this.teamService.loadByTeamName(guestTeamName);
			if (hostTeam == null || guestTeam == null) {
				return null;
			}

			int hostTeamId = hostTeam.getTeamId();
			int guestTeamId = guestTeam.getTeamId();

			Chang changInsert = new Chang(hostTeamId, hostTeamName,
					guestTeamId, guestTeamName, matchTime);
			this.changService.add(changInsert);

			changInsert = this.changService.loadByTeamAndMatchTime(teamTimeMap);

			return changInsert;
		} else {
			return changCheck;
		}
	}

	public void handleRecContent(int changId, int rang, double s, double p,
			double f, String strCrawlTime) {

		Timestamp crawlTime = Timestamp.valueOf(strCrawlTime);

		Shengfurec shengfurec = new Shengfurec(changId, rang, s, p, f,
				crawlTime);

		System.out.println(shengfurec.toString());

		this.shengfurecService.add(shengfurec);
	}

	public TeamService getTeamService() {
		return teamService;
	}

	public void setTeamService(TeamService teamService) {
		this.teamService = teamService;
	}

	public ChangService getChangService() {
		return changService;
	}

	public void setChangService(ChangService changService) {
		this.changService = changService;
	}

	public ShengfurecService getShengfurecService() {
		return shengfurecService;
	}

	public void setShengfurecService(ShengfurecService shengfurecService) {
		this.shengfurecService = shengfurecService;
	}

}
