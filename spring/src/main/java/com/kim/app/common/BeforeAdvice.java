package com.kim.app.common;

import org.aspectj.lang.JoinPoint;

public class BeforeAdvice {
	public void printLog(JoinPoint jp) {
		String bm=jp.getSignature().getName();
		System.out.println(bm+"()메서드가 호출됨");
		System.out.println("인자로는...");
		Object[] args=jp.getArgs();
		for(Object v:args) {
			System.out.println(v);
		}
		System.out.println("...사용중에있음");
		/*
		// 어드바이스 메서드에서 jp 객체를 사용하려면
		// 메서드 매개변수로 선언만 하면된다!
		// => 스프링 컨테이너가 jp 객체를 자동으로 생성한다!
		String bm=jp.getSignature().getName();
		Object[] args=jp.getArgs();
		System.out.println("클라이언트 메서드 수행시작...");
		System.out.println("이용하는 메서드: "+bm);
		System.out.println("이용하는 매개변수들...");
		for(Object v:args) {
			System.out.println(v);
		}
		System.out.println("----------");
		//System.out.println("공통로직: 핵심로직을 수행하기전에 호출됨");
		*/
	}
}
