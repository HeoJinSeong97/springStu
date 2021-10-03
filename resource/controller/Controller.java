package com.heo.view.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface Controller {
	String doAction(HttpServletRequest request, HttpServletResponse response);//경로를 리턴
	
}
