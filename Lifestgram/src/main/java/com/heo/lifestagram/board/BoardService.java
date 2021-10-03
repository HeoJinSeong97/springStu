package com.heo.lifestagram.board;

import java.util.List;

public interface BoardService {
	public void insertBoard(BoardVO vo);
	public List<BoardVO> getBoard(BoardVO vo);
}
