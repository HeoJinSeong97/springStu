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
		System.out.println("LogAfterThrowingAdvice �����");
		
		if(exObj instanceof RuntimeException) {
			System.out.println("�ǽð�����!");
		}
		else {
			System.out.println("��Ȯ�ο���!!!");
		}
	}
}
