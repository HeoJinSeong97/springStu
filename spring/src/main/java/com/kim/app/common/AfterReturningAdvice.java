package com.kim.app.common;

import org.aspectj.lang.JoinPoint;

import com.kim.app.board.BoardVO;
import com.kim.app.users.UsersVO;

public class AfterReturningAdvice {
	public void printLog(JoinPoint jp,Object reObj) {
		String bm=jp.getSignature().getName();
		System.out.println(bm+"()메서드의결과값: "+reObj);
		if(reObj instanceof BoardVO) {
			BoardVO vo=(BoardVO)reObj;
			System.out.println(vo.getId()+": "+vo.getTitle());
		}
		else if(reObj instanceof UsersVO) {
			UsersVO vo=(UsersVO)reObj;
			System.out.println(vo.getRole()+" 로그인");
		}
		else {
			System.out.println("매칭되는 클래스 없음!");
		}
		/*
		String bm=jp.getSignature().getName();
		System.out.println(bm+" 호출됨");
		// 바인딩 변수(스프링설정파일에 매핑 설정을 필요로함)
		// 1. BoardVO -> getWDate()
		// 2. UserVO -> getPassword()
		if(reObj instanceof BoardVO) {
			BoardVO vo=(BoardVO)reObj;
			System.out.println(vo.getId()+": "+vo.getTitle());
		}
		else {
			System.out.println("매칭되는 클래스 없음!");
		}
		System.out.println("-----");
		//System.out.println("공통로직: 핵심로직을 수행한 이후에 호출됨");
		*/
	}
}
