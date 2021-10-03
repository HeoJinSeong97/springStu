package com.kim.app.users.impl;

import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kim.app.users.UsersVO;


@Repository("usersDAO")
public class UsersDAO {
	
	@Autowired 
	private SqlSessionTemplate mybatis;
	
	
	public int insertUsers(UsersVO vo) {
		int res = mybatis.insert("UsersDAO.insertUsers",vo);
		mybatis.commit();
		return res;
	}
	
	public UsersVO getUsers(UsersVO vo) {
		return (UsersVO)mybatis.selectOne("UsersDAO.getUsers", vo);
	}
}