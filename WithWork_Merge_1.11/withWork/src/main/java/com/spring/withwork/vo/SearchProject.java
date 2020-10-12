package com.spring.withwork.vo;

public class SearchProject {
	
	private String type;
	private String keyword;

	public SearchProject() {

	}

	public SearchProject(String type, String keyword) {
		this.type = type;
		this.keyword = keyword;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getKeyword() {
		return keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

	@Override
	public String toString() {
		return "SearchProject [type=" + type + ", keyword=" + keyword + "]";
	}
	
}
