package org.ailab.service;

import java.util.List;

import org.ailab.dao.ShengfurecMapper;
import org.ailab.model.Shengfurec;

public class ShengfurecServiceImpl implements ShengfurecService {

	private ShengfurecMapper shengfurecMapper;

	public void add(Shengfurec shengfurec) {
		this.shengfurecMapper.add(shengfurec);
	}

	public void deleteById(int recId) {
		this.shengfurecMapper.deleteById(recId);
	}

	public void update(Shengfurec shengfurec) {
		this.shengfurecMapper.update(shengfurec);
	}

	public List<Shengfurec> listByChangId(int changId) {
		return this.shengfurecMapper.listByChangId(changId);
	}

	public Shengfurec loadById(int recId) {
		return this.shengfurecMapper.loadById(recId);
	}

	public ShengfurecMapper getShengfurecMapper() {
		return shengfurecMapper;
	}

	public void setShengfurecMapper(ShengfurecMapper shengfurecMapper) {
		this.shengfurecMapper = shengfurecMapper;
	}

}
