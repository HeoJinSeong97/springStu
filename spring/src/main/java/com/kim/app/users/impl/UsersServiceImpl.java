package com.kim.app.users.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kim.app.users.UsersService;
import com.kim.app.users.UsersVO;

@Service("UsersService")
public class UsersServiceImpl implements UsersService{

	@Autowired
	private UsersDAO usersDAO;
	
	@Override
	public void insertUsers(UsersVO vo) {
		usersDAO.insertUsers(vo);	
	}

	@Override
	public UsersVO getUsers(UsersVO vo) {
//		if(vo.getPassword().equals("1234")) {
//			throw new RuntimeException("���ܾ����̽�ó���ǽ���!");
//		}
		return usersDAO.getUsers(vo);
	}

}
