package org.ailab.service;

import java.util.List;

import org.ailab.dao.TeamMapper;
import org.ailab.model.Team;

public class TeamServiceImpl implements TeamService {

	private TeamMapper teamMapper;

	public void add(Team team) {
		this.teamMapper.add(team);
	}

	public void deleteById(int teamId) {
		this.teamMapper.deleteById(teamId);
	}

	public void update(Team team) {
		this.teamMapper.update(team);
	}

	public Team loadById(int teamId) {
		return this.teamMapper.loadById(teamId);
	}

	public Team loadByTeamName(String teamName) {
		return this.teamMapper.loadByTeamName(teamName);
	}

	public List<Team> listByRank(int rank) {
		return this.teamMapper.listByRank(rank);
	}

	public List<Team> listByDisable(int disable) {
		return this.teamMapper.listByDisable(disable);
	}

	public TeamMapper getTeamMapper() {
		return teamMapper;
	}

	public void setTeamMapper(TeamMapper teamMapper) {
		this.teamMapper = teamMapper;
	}

}
