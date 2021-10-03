package com.heo.view.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.heo.app.board.BoardVO;
import com.heo.app.board.impl.BoardDAO;

public class GetBoardController implements Controller{
	@Override
	public String doAction(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		System.out.println("getBoardController");
		
		BoardVO vo = new BoardVO();
		BoardDAO dao = new BoardDAO();
		
		int id = Integer.parseInt(request.getParameter("query"));
		vo.setId(id);
		BoardVO v = dao.getBoard(vo);
		HttpSession session = request.getSession();
		session.setAttribute("v", v);
		
		return "getBoard";


	}
}
