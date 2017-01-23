package com.zkyunso.parser;

import java.util.ArrayList;
import java.util.List;
/**
 * 有几个入口页就有多少个pipeline
 * @author gaoj
 *
 */
public class ParserRequest {
	List<ParserPipeline> lines=new ArrayList<>();

	public void parseLine() {
		
	}

	public List<ParserPipeline> getLines() {
		return lines;
	}

	public void setLines(List<ParserPipeline> lines) {
		this.lines = lines;
	}
	
}
