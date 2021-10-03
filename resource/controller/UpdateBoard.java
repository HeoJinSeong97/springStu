package com.heo.view.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.heo.app.board.BoardVO;
import com.heo.app.board.impl.BoardDAO;

public class UpdateBoard implements Controller{
	@Override
	public String doAction(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		int id = Integer.parseInt(request.getParameter("id"));
		String title = request.getParameter("title");
		String content = request.getParameter("content");

		BoardVO Bvo=new BoardVO();
        BoardDAO Bdao=new BoardDAO();
		
		Bvo.setId(id);
		Bvo.setTitle(title);
		Bvo.setContent(content);
		System.out.println("���泻�� : "+Bvo);
		Bdao.updateBoard(Bvo);
		System.out.println("�Խñ۾�����Ʈ��Ʈ�ѳ�");
		
		return "getBoardList.do";
	}
}
