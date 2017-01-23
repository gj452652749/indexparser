package com.zkyunso.parser;

public class ParserPipeline {
	ParserValue first;
	ParserValue middle;
	ParserValue basic;
	public ParserValue getFirst() {
		return first;
	}
	public void setFirst(ParserValue first) {
		this.first = first;
	}
	public ParserValue getMiddle() {
		return middle;
	}
	public void setMiddle(ParserValue middle) {
		this.middle = middle;
	}
	public void addMiddle(ParserValue middleValue) {
		ParserValue current=middle;
		while(current!=null) {
			if(current.next==basic) {
				current.setNext(middleValue);
				middleValue.setNext(basic);
				break;
			}
			current=current.next;
		}
	}
	public ParserValue getBasic() {
		return basic;
	}
	public void setBasic(ParserValue basic) {
		this.basic = basic;
	}
	
}
