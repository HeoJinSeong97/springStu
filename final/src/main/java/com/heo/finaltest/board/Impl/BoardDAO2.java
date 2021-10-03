package com.heo.finaltest.board.Impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.heo.finaltest.board.BoardVO;
import com.heo.finaltest.common.JDBCUtill;

@Repository("boardDAO")
public class BoardDAO2 {
	
	private JdbcTemplate jdbcTemplate;
	
	private final String sql = "select * from Board order by id desc";
	
	
	public List<BoardVO> getBoardList(BoardVO vo) {
		System.out.println("BoardDAO2 메서드호출");
		List<BoardVO> datas = new ArrayList<BoardVO>();
		
		return jdbcTemplate.query(sql, new BoardRowMapper());
	}
	
	
}
class BoardRowMapper implements RowMapper<BoardVO>{
	@Override
	public BoardVO mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		BoardVO board = new BoardVO();
		board.setId(rs.getInt("id"));
		board.setTitle(rs.getString("title"));
		board.setWriter(rs.getString("writer"));
		board.setContent(rs.getString("content"));
		return board;
	}
}
