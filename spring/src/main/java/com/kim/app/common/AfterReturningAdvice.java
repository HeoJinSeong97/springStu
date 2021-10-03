package com.kim.app.common;

import org.aspectj.lang.JoinPoint;

import com.kim.app.board.BoardVO;
import com.kim.app.users.UsersVO;

public class AfterReturningAdvice {
	public void printLog(JoinPoint jp,Object reObj) {
		String bm=jp.getSignature().getName();
		System.out.println(bm+"()�޼����ǰ����: "+reObj);
		if(reObj instanceof BoardVO) {
			BoardVO vo=(BoardVO)reObj;
			System.out.println(vo.getId()+": "+vo.getTitle());
		}
		else if(reObj instanceof UsersVO) {
			UsersVO vo=(UsersVO)reObj;
			System.out.println(vo.getRole()+" �α���");
		}
		else {
			System.out.println("��Ī�Ǵ� Ŭ���� ����!");
		}
		/*
		String bm=jp.getSignature().getName();
		System.out.println(bm+" ȣ���");
		// ���ε� ����(�������������Ͽ� ���� ������ �ʿ����)
		// 1. BoardVO -> getWDate()
		// 2. UserVO -> getPassword()
		if(reObj instanceof BoardVO) {
			BoardVO vo=(BoardVO)reObj;
			System.out.println(vo.getId()+": "+vo.getTitle());
		}
		else {
			System.out.println("��Ī�Ǵ� Ŭ���� ����!");
		}
		System.out.println("-----");
		//System.out.println("�������: �ٽɷ����� ������ ���Ŀ� ȣ���");
		*/
	}
}
