package com.zkyunso.parser.extraction;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * ui元素抽取工具类
 * @author gaoj
 *
 */
public class UiExtractor {
	public Matcher getMatcher(String patt,String pageBody) {
		Pattern r = Pattern.compile(patt);		 
	      // 现在创建 matcher 对象
	    Matcher m = r.matcher(pageBody);
	    return m;
	}
	/**
	 * a.jpg /a.jpg /2016-04-08/13067.html
	 * @param ele
	 * @return
	 */
	public boolean isUrl(String ele) {
		
		return false;
	}
	/**
	 * 相对转绝对
	 * @param ele
	 * @return
	 */
	public String re2abUrl(String link,String baseUrl ) {
		if(link.startsWith("http://")||link.startsWith("https://"))
			return link;
		try {
			return new URL(new URL(baseUrl) ,link ).toString();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return link;
	}
	public void matchEle(String pre,String foll,String pageBody,boolean isLink,String url) {
		// 现在创建 matcher 对象
	      Matcher m = getMatcher(pre+"(.*)"+foll,pageBody);
	      if (m.find( )) {
	         System.out.println("Found value: " + m.group(1) );
	      } else {
	         System.out.println("NO MATCH");
	      }
	}
	public void matchEle(String patt,String pageBody,boolean isLink,String url) {
		  // 现在创建 matcher 对象
	      Matcher m = getMatcher(patt,pageBody);
	      if (m.find( )) {
	         System.out.println("Found value: " + m.group(0) );
	      } else {
	         System.out.println("NO MATCH");
	      }
	}
	public void matchEles(String pre,String foll,String pageBody,boolean isLink,String url) {
		// 现在创建 matcher 对象
	      Matcher m = getMatcher(pre+"(.*)"+foll,pageBody);
	      String ele;
	      while (m.find( )) {
	    	  ele=m.group(1);
	    	  if(isLink)
	    		  ele=re2abUrl(ele, url);
	         System.out.println("Found value: " + ele );
	      } 
	}
	public void matchEles(String patt,String pageBody,boolean isLink,String url) {
		  // 现在创建 matcher 对象
	      Matcher m = getMatcher(patt,pageBody);
	      while (m.find( )) {
	         System.out.println("Found value: " + m.group(0) );
	      } 
	}
	public void doExtractEle(ExtractionRule rule,String pageBody,String url) {
		
	}
	public void doExtractEles(ExtractionRule rule,String pageBody,String url) {
		//如果匹配元素是url，则自动将相对转绝对
		matchEles(rule.getPreviousFlag(),rule.getFollowingFlag(),pageBody,rule.isLink,url);
	}
}
