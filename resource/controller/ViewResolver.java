package com.heo.view.controller;

public class ViewResolver {
//	1. ����� �մ�
//	2. ����� Ȯ����
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
