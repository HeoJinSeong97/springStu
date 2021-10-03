package com.heo.view.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.heo.app.board.BoardVO;
import com.heo.app.board.impl.BoardDAO;

public class DeleteBoard implements Controller{
	@Override
	public String doAction(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
        
        String id=request.getParameter("id");
        
        BoardVO bvo=new BoardVO();
        BoardDAO bdao=new BoardDAO();
        bvo.setId(Integer.parseInt(id));
        bdao.deleteBoard(bvo);
        
        System.out.println("게시글 삭제 끝");
        
		return "getBoardList.do";
	}
}
