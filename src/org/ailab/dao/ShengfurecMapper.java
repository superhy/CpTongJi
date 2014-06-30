package org.ailab.dao;

import java.util.List;

import org.ailab.model.Shengfurec;

public interface ShengfurecMapper {

	void add(Shengfurec shengfurec);

	void deleteById(int recId);

	void update(Shengfurec shengfurec);

	List<Shengfurec> listByChangId(int changId);

	Shengfurec loadById(int recId);
}
