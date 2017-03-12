package com.zkyunso.db.mybatis.dao;

import java.util.List;

import com.zkyunso.db.mybatis.bean.ParserTask;

public interface ParserTaskMapper {
	void save(ParserTask bean);
	void update(ParserTask bean);
	void delete(int id);
	ParserTask getById(int id);
	List<ParserTask> getAll();
}
