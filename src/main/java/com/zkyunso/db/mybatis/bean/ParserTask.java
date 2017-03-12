package com.zkyunso.db.mybatis.bean;

public class ParserTask {
	int id;
	String name;
	String remark;
	int configJsonId;
	String createTime;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	
	public int getConfigJsonId() {
		return configJsonId;
	}
	public void setConfigJsonId(int configJsonId) {
		this.configJsonId = configJsonId;
	}
	public String getCreateTime() {
		return createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	

}
