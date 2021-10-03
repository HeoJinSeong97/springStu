package com.heo.lifestagram.board.Impl;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.heo.lifestagram.board.BoardVO;

@Repository("boardDAO")
public class BoardDAO {
	
	@Autowired
	private SqlSessionTemplate mybatis;
	
	public void insertBoard(BoardVO vo) {
		mybatis.insert("BoardDAO.insertBoard", vo);
	}

	public List<BoardVO> getBoard(BoardVO vo) {
		// TODO Auto-generated method stub
		return mybatis.selectList("Board.getBoard",vo);
	}
}
