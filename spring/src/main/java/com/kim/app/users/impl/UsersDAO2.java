package com.kim.app.users.impl;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.kim.app.users.UsersVO;

@Repository("usersDAO2")
public class UsersDAO2 {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public void insertUsers(UsersVO vo) {
		String sql="insert into users values(?,?,?,'USER')";
		System.out.println("insertUsers() 수행중");
		jdbcTemplate.update(sql, vo.getId(),vo.getPassword(),vo.getName());
	}
	
	public UsersVO getUsers(UsersVO vo) {
		String sql="select * from users where id=? and password=?";
		System.out.println("getUsers() 수행중2");
		Object[] args= {vo.getId(),vo.getPassword()};
		return jdbcTemplate.queryForObject(sql, args,new UserRowMapper());
	}
}

class UserRowMapper implements RowMapper{

	@Override
	public UsersVO mapRow(ResultSet rs, int rowNum) throws SQLException {
		UsersVO data=new UsersVO();
		data.setId(rs.getString("id"));
		data.setName(rs.getString("name"));
		data.setPassword(rs.getString("password"));
		data.setRole(rs.getString("role"));
		return data;
	}
	
}





