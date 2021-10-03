package com.kim.app.common;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Service;

@Service
@Aspect
public class LogAfterAdvice {
	
	@After("PointcutTest.aPointcut()")
	public void printLog() {
		System.out.println("항상 수행되는 AfterAdvice");
	}
	
}
// 포인트컷을 두개가지고있는 어드바이스
// -> 모든 메서드에대해 수행되는 LogAfterAdvice를 구현해주세요!
// 현재 예외가 발생하는 중입니다.
// 그래도 AfterAdvice는 수행됨을 콘솔에 출력해주세요!~~