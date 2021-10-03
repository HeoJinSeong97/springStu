package com.heo.view.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.heo.finaltest.board.BoardVO;
import com.heo.finaltest.board.Impl.BoardService;

@Controller
public class BoardController {
	
	@Autowired
	private static BoardService boardService;
	
	@RequestMapping("/index.do")
	public String getBaordList(BoardVO vo, Model m) {
		
		List<BoardVO> datas = boardService.getBoardList(vo);
		m.addAttribute("datas", datas);
		return "index.jsp";
	}
}
