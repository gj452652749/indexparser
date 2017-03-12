package com.zkyunso.db.mybatis.transaction;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import com.zkyunso.db.mybatis.bean.ParserTask;
import com.zkyunso.db.mybatis.dao.ParserTaskMapper;

import net.sf.json.JSONObject;

public class DbHandler {
	@Autowired
	private ParserTaskMapper parserTaskMapper;
	public String getIniPageData() {
		JSONObject result=new JSONObject();
		List<ParserTask> beans=parserTaskMapper.getAll();
		//dsDetailsBeans=dsDetailsBeans.subList(0, 1);
		//List<DsInfo> dsInfoBeans=dsInfoMapper.getAll();
		result.put("modals", beans);
		//result.put("infos", dsInfoBeans);
		System.out.println(result.toString());
		return result.toString();
	}
	public void addTask(ParserTask bean) {
		parserTaskMapper.save(bean);
	}
}
