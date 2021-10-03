package com.kim.app.common;

import org.aspectj.lang.JoinPoint;

public class AfterThrowingAdvice {
	public void printLog(JoinPoint jp,Exception exObj) {
		// Exception 역시 바인딩변수
		String bm=jp.getSignature().getName();
		System.out.println(bm+"() 메서드를 수행하는 도중에 예외가 발생함!");
		System.out.println("예외메세지: "+exObj.getMessage());
		//System.out.println("공통로직: 핵심로직을 수행중에 예외발생하면 호출됨");
		
		if(exObj instanceof NullPointerException) {
			System.out.println("실행시오류");
		}
		else {
			System.out.println("확인하지않은 오류발생!");
		}
	}
}
