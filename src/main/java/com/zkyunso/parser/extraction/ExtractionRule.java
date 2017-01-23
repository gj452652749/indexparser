package com.zkyunso.parser.extraction;
/**
 * 匹配规则，前后匹配OR正则匹配
 * @author gaoj
 *
 */
public class ExtractionRule {

	String name;
	boolean isUnique=false;//是否只匹配一个，若是最终页面，则一般只匹配一个
	boolean isLink=true;//是否是链接，标识为链接的，如果是相对，则会被转成绝对 只有最终页面才是false
	int flagType;//匹配模式：0为前后匹配 1为模式匹配
	//前后匹配
	String previousFlag;
	String followingFlag;
	//模式匹配
	String patternFlag;
	//dom选择器匹配 jsoup
	String domSelector;
	
	public ExtractionRule(boolean isUnique, int flagType, String previousFlag, String followingFlag,
			boolean isLink,String patternFlag) {
		super();
		this.isUnique = isUnique;
		this.isLink=isLink;
		this.flagType = flagType;
		this.previousFlag = previousFlag;
		this.followingFlag = followingFlag;
		this.patternFlag = patternFlag;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isUnique() {
		return isUnique;
	}
	public void setUnique(boolean isUnique) {
		this.isUnique = isUnique;
	}
	
	public boolean isLink() {
		return isLink;
	}
	public void setLink(boolean isLink) {
		this.isLink = isLink;
	}
	public int getFlagType() {
		return flagType;
	}
	public void setFlagType(int flagType) {
		this.flagType = flagType;
	}
	public String getPreviousFlag() {
		return previousFlag;
	}
	public void setPreviousFlag(String previousFlag) {
		this.previousFlag = previousFlag;
	}
	public String getFollowingFlag() {
		return followingFlag;
	}
	public void setFollowingFlag(String followingFlag) {
		this.followingFlag = followingFlag;
	}
	public String getPatternFlag() {
		return patternFlag;
	}
	public void setPatternFlag(String patternFlag) {
		this.patternFlag = patternFlag;
	}
	public String getDomSelector() {
		return domSelector;
	}
	public void setDomSelector(String domSelector) {
		this.domSelector = domSelector;
	}
	
}
