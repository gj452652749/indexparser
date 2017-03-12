package com.zkyunso.mongo.service;

import net.sf.json.JSONObject;

public class MongoDao {

	public String getParserPageInitData(String userName,String coreName) {
		String stmtJson="{userName:\""+userName+"\",coreName:\""+coreName+"\"}";
		return MongoHandler.getInstance().getAll("parserConfig", stmtJson);
	}
	public void put(String userName,String coreName,String modalJson) {
		JSONObject jsonObj=JSONObject.fromObject(modalJson);
		jsonObj.put("userName", userName);
		jsonObj.put("coreName", coreName);
		String stmtJson=jsonObj.toString();
		MongoHandler.getInstance().put(stmtJson,"parserConfig" );
	}
	public void getConfiguredTbs(String key) {
		
	}

}
