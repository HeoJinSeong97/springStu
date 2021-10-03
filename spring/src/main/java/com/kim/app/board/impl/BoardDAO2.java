package com.kim.app.board.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.kim.app.board.BoardVO;

@Repository("boardDAO2")
public class BoardDAO2 { // JdbcTemplate을 이용할 계획 /// extends JdbcDaoSupport
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	/*@Autowired
	public void setSuperDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}*/
	
	public void insertBoard(BoardVO vo) {
		//  자동증가 해제 - 트랜잭션 실습
		String sql="insert into board (id,title,writer,content) values((select nvl(max(id),0)+1 from board),?,?,?)";
		// nvl( , )
		// null값을 다른값 or 0으로 변경하는 함수
		System.out.println("insertBoard() 수행중");
		jdbcTemplate.update(sql,vo.getTitle(),vo.getWriter(),vo.getContent());
	}

	public void updateBoard(BoardVO vo) {
		String sql="update board set title=?, content=? where id=?";
		System.out.println("updateBoard() 수행중");
		jdbcTemplate.update(sql,vo.getTitle(),vo.getContent(),vo.getId());
	}

	public void deleteBoard(BoardVO vo) {
		String sql="delete board where id=?";
		System.out.println("deleteBoard() 수행중");
		jdbcTemplate.update(sql,vo.getId());
	}

	public BoardVO getBoard(BoardVO vo) {
		String sql="select * from board where id=?";
		System.out.println("getBoard() 수행중");
		
		Object[] args= {vo.getId()};
		return jdbcTemplate.queryForObject(sql, args,new BoardRowMapper());
	}

	public List<BoardVO> getBoardList(BoardVO vo) {
		String sql="select * from board where title like '%'||?||'%' order by id desc";
		String sql2="select * from board where content like '%'||?||'%' order by id desc";
		System.out.println("getBoardList() 수행중!");
		
		Object[] args= {vo.getSearchContent()};
		if(vo.getSearch().equals("title")) {
			return jdbcTemplate.query(sql, args, new BoardRowMapper());
		}
		else {
			return jdbcTemplate.query(sql2, args, new BoardRowMapper());
		}
		
	}
}



class BoardRowMapper implements RowMapper{

	@Override
	public BoardVO mapRow(ResultSet rs, int rowNum) throws SQLException {
		BoardVO data=new BoardVO();
		data.setCnt(rs.getInt("cnt"));
		data.setContent(rs.getString("content"));
		data.setId(rs.getInt("id"));
		data.setTitle(rs.getString("title"));
		data.setWdate(rs.getDate("wdate"));
		data.setWriter(rs.getString("writer"));
		return data;
	}
	
}


