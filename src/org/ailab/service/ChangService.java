package org.ailab.service;

import java.util.Map;

import org.ailab.model.Chang;

public interface ChangService {

	public void add(Chang chang);

	public void deleteById(int changId);

	public void update(Chang chang);

	public Chang loadByTeamAndMatchTime(Map<String, Object> teamTimeMap);

	public Chang loadById(int changId);
}
