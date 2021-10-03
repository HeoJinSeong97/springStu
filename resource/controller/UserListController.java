package com.heo.view.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.heo.app.user.UserVO;
import com.heo.app.user.Impl.UserDAO;

public class UserListController implements Controller{
	@Override
	public String doAction(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		UserVO vo = new UserVO();
		UserDAO dao = new UserDAO();
		List<UserVO> userlist = dao.getUserList();
		HttpSession session = request.getSession();
		session.setAttribute("data", userlist);
		if (userlist != null) {
			return "getUserList";			
		} else {
			return "getBoardList.do";

		}
	}
}
