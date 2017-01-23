package com.zkyunso.parser.bean;

import java.util.List;

import com.zkyunso.parser.extraction.ExtractionRule;

/**
 * 用于前台配置的pojo
 * @author gaoj
 *
 */
public class ConfigBean {
	String name;
	List<String> indexs;
	List<String> middles;
	List<ExtractionRule> basic;
}
