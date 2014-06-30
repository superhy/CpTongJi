package org.ailab.service;

import java.util.List;

import org.ailab.model.Shengfurec;

public interface ShengfurecService {

	public void add(Shengfurec shengfurec);

	public void deleteById(int recId);

	public void update(Shengfurec shengfurec);

	public List<Shengfurec> listByChangId(int changId);

	public Shengfurec loadById(int recId);
}
