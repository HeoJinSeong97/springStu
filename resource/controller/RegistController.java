package com.heo.view.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegistController implements Controller{
	@Override
	public String doAction(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		System.out.println("ȸ��������������Ʈ�ѷ�");
		return "regist";
	}
}
