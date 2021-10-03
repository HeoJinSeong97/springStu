package com.kim.app.common;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Service;

@Service
@Aspect
public class LogAdvice {
	
	/*
	// �����̽��� ����Ʈ���� ����
	// "�����޼���"
	// : �޼����� ��ϱ����� ����ִ�(==������ ����) �޼���
	// : ����� �����ϴ°Ϳ��� �����̾���!
	// : ����Ʈ���� �ĺ��ϴ� ������ ���!!!
	@Pointcut("execution(* com.kim.app..*Impl.*(..))")
	public void aPointcut() {}
	
	@Pointcut("execution(* com.kim.app..*Impl.get*(..))")
	public void bPointcut() {}
	*/
	
	@Before("PointcutTest.aPointcut()")
	public void printLog() {
		System.out.println("�����̽� �α�ó����...");
	}
}
