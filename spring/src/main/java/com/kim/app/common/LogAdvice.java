package com.kim.app.common;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Service;

@Service
@Aspect
public class LogAdvice {
	
	/*
	// 어드바이스에 포인트컷을 선언
	// "참조메서드"
	// : 메서드의 블록구간이 비어있는(==로직이 없는) 메서드
	// : 기능을 수행하는것에는 관심이없다!
	// : 포인트컷을 식별하는 역할을 담당!!!
	@Pointcut("execution(* com.kim.app..*Impl.*(..))")
	public void aPointcut() {}
	
	@Pointcut("execution(* com.kim.app..*Impl.get*(..))")
	public void bPointcut() {}
	*/
	
	@Before("PointcutTest.aPointcut()")
	public void printLog() {
		System.out.println("어드바이스 로그처리중...");
	}
}
