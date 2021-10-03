package com.heo.view.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.heo.app.board.BoardVO;
import com.heo.app.board.impl.BoardDAO;

public class InsertBoardController implements Controller{
	@Override
	public String doAction(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
		BoardVO vo = new BoardVO();
		BoardDAO dao = new BoardDAO();
		
		String title = request.getParameter("title");
		String writer = request.getParameter("writer");
		String content = request.getParameter("content");

		vo.setTitle(title);
		vo.setContent(content);
		vo.setWriter(writer);

		dao.insertBoard(vo);

		return "getBoardList.do";
	}
}
