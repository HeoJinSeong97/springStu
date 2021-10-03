package com.kim.app.common;

public class AfterAdvice {
	public void printLog() {
		System.out.println("데이터 잘 출력될예정.");
		//System.out.println("공통로직: 핵심로직을 수행한 이후에 무조건 호출됨");
	}
}
