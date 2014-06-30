package org.ailab.service;

import java.util.Map;

import org.ailab.dao.ChangMapper;
import org.ailab.model.Chang;

public class ChangServiceImpl implements ChangService {

	private ChangMapper changMapper;

	public void add(Chang chang) {
		this.changMapper.add(chang);
	}

	public void deleteById(int changId) {
		this.changMapper.deleteById(changId);
	}

	public void update(Chang chang) {
		this.changMapper.update(chang);
	}

	public Chang loadByTeamAndMatchTime(Map<String, Object> teamTimeMap) {
		return this.changMapper.loadByTeamAndMatchTime(teamTimeMap);
	}

	public Chang loadById(int changId) {
		return this.changMapper.loadById(changId);
	}

	public ChangMapper getChangMapper() {
		return changMapper;
	}

	public void setChangMapper(ChangMapper changMapper) {
		this.changMapper = changMapper;
	}

}
