package com.kim.app.common;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Service;

@Service
@Aspect
public class LogAfterReturningAdvice {
		
	@AfterReturning(pointcut="PointcutTest.bPointcut()",returning="reObj")
	public void printLog(JoinPoint jp,Object reObj) {
		System.out.println("LogAfterReturningAdvice ½ÇÇàµÊ");
		
		
	}
	
}
