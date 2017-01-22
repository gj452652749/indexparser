package com.zkyunso.parser;

public class ParserValue {
	ParserValue next=null;
	String info;//存储匹配模式
	public ParserValue getNext() {
		return next;
	}
	public void setNext(ParserValue next) {
		this.next = next;
	}
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	
}
