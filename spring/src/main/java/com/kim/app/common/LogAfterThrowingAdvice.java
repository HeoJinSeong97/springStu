package com.kim.app.common;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Service;

@Service
@Aspect
public class LogAfterThrowingAdvice {
		
	@AfterThrowing(pointcut="PointcutTest.bPointcut()",throwing="exObj")
	public void printLog(JoinPoint jp,Exception exObj) {
		System.out.println("LogAfterThrowingAdvice 실행됨");
		
		if(exObj instanceof RuntimeException) {
			System.out.println("실시간예외!");
		}
		else {
			System.out.println("미확인예외!!!");
		}
	}
}
