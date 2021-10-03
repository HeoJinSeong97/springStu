package com.kim.app.board.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import com.kim.app.board.BoardVO;

/** 
 * SqlSessionFactoryBean 사용하는 방법.
 * 1. 직접 class를 구현
 * 
 * SessionFactoryBean 빈을 생성했기 때문에 extends를 한다
 * @Autowired
	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
		super.setSqlSessionFactory(sqlSessionFactory);
	}
	
 * 2.
 * 두번째 방법 SqlSessionTemplate를 <bean>으로 등록하여 사용
 * applicationContext,xml
 * <bean class="org.mybatis.spring.SqlSessionTemplate">
		<constructor-arg></constructor-arg>
	</bean>
 * */

@Repository("boardDAO")
public class BoardDAO{

	
	@Autowired 
	private SqlSessionTemplate mybatis;


	
	public void insertBoard(BoardVO vo) {
		mybatis.insert("BoardDAO.insertBoard", vo);
//		mybatis.commit();
	}
	
	public int updateBoard(BoardVO vo) {
		int res = mybatis.update("BoardDAO.updateBoard",vo);
//		mybatis.commit();
		return res;
	}
	
	public int deleteBoard(BoardVO vo) {
		int res = mybatis.delete("BoardDAO.deleteBoard",vo);
//		mybatis.commit();
		return res;
	}
	
	public BoardVO getBoard(BoardVO vo) {
		return (BoardVO)mybatis.selectOne("BoardDAO.getBoard",vo);
	}
	
	public List<BoardVO> getBoardList(BoardVO vo) {
		return mybatis.selectList("BoardDAO.getBoardList",vo);
	}
}
