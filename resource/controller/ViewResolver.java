package com.heo.view.controller;

public class ViewResolver {
//	1. 경로의 앞당
//	2. 경로의 확장자
	public String prefix;
	public String suffix;
	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}
	public void setSuffix(String suffix) {
		this.suffix = suffix;
	}
	public String getView(String view) {
		return this.prefix+view+this.suffix;
	}
	
}
