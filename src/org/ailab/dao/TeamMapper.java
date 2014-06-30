package org.ailab.dao;

import java.util.List;

import org.ailab.model.Team;

public interface TeamMapper {

	void add(Team team);

	void deleteById(int teamId);

	void update(Team team);

	Team loadById(int teamId);

	Team loadByTeamName(String teamName);

	List<Team> listByRank(int rank);

	List<Team> listByDisable(int disable);
}
