package org.ailab.dao;

import java.util.Map;

import org.ailab.model.Chang;

public interface ChangMapper {

	void add(Chang chang);

	void deleteById(int changId);

	void update(Chang chang);

	Chang loadByTeamAndMatchTime(Map<String, Object> teamTimeMap);

	Chang loadById(int changId);
}
