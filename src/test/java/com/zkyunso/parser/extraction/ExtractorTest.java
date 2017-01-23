package com.zkyunso.parser.extraction;

import org.junit.Test;

import com.zkyunso.util.http.HttpRest;
import com.zkyunso.util.http.SpringRestImp;

public class ExtractorTest {

	HttpRest httpRest=new SpringRestImp();
	@Test
	public void doExtract() {
		UiExtractor extractor=new UiExtractor();
		String url="http://www.chinabioindustry.com/yiliaojiankang/index.html";
		ExtractionRule rule=new ExtractionRule(false, 0, "<a href=\"", "\" target",true, null);
		extractor.doExtractEles(rule, httpRest.get(url),url);
	}
}
