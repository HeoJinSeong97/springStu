package com.heo.view.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.heo.app.user.UserVO;
import com.heo.app.user.Impl.UserDAO;

public class DoRegistController implements Controller{
	@Override
	public String doAction(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		String name = request.getParameter("name");
		UserVO vo = new UserVO();
		UserDAO dao = new UserDAO();
		vo.clear();		
		vo.setId(id);
		vo.setName(name);
		vo.setPassword(password);
		vo.setRole("USER");
		
		UserVO data = dao.getUser(vo);

		if(data == null){
			dao.insertUser(vo);
			System.out.println("성공");
			return "login";
		}else{
			System.out.println("실패");
			return "regist";			
		}
	}
}
