package org.ailab.service;

import java.util.List;

import org.ailab.model.Team;

public interface TeamService {

	public void add(Team team);

	public void deleteById(int teamId);

	public void update(Team team);

	public Team loadById(int teamId);

	public Team loadByTeamName(String teamName);

	public List<Team> listByRank(int rank);

	public List<Team> listByDisable(int disable);
}
