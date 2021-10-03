package com.heo.finaltest.board.Impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.heo.finaltest.board.BoardVO;
import com.heo.finaltest.common.JDBCUtill;

@Repository("boardDAO")
public class BoardDAO {
	
	private Connection conn = null;
	private PreparedStatement pstmt;
	private final String sql = "select * from Board order by id desc";
	
	
	public List<BoardVO> getBoardList(BoardVO vo) {
		System.out.println("BoardDAO 메서드호출");
		List<BoardVO> datas = new ArrayList<BoardVO>();
		conn = JDBCUtill.getConnection();
		try {
			pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery(sql);
			while(rs.next()) {
				BoardVO data = new BoardVO();
				data.setId(rs.getInt("id"));
				data.setTitle(rs.getString("title"));
				data.setWriter(rs.getString("writer"));
				data.setContent(rs.getString("content"));
				datas.add(data);
				
			}
			for (BoardVO boardVO : datas) {
				System.out.println(boardVO);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			JDBCUtill.close(conn, pstmt);
		}
		return datas;
	}
	
	
}
