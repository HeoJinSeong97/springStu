package com.heo.view.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

import com.heo.app.board.BoardVO;
import com.heo.app.board.impl.BoardDAO;

public class BoardListController implements Controller{
	@Override
	public String doAction(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		System.out.println("���帮��Ʈ��Ʈ�ѷ�");
		BoardVO vo = new BoardVO();
		BoardDAO dao = new BoardDAO();
		List<BoardVO> boardList = dao.getBoardList(vo);
		HttpSession session = request.getSession();
		session.setAttribute("data", boardList);
		
//		���Ŀ� ����� request�� ���濹��
//		HttpSession session = request.getSession();
//		session.setAttribute("boardList", boardList);
		return "/getBoardList";
	}
}
