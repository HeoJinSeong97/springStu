package com.kim.app.common;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Service;

@Service
@Aspect
public class LogAfterAdvice {
	
	@After("PointcutTest.aPointcut()")
	public void printLog() {
		System.out.println("�׻� ����Ǵ� AfterAdvice");
	}
	
}
// ����Ʈ���� �ΰ��������ִ� �����̽�
// -> ��� �޼��忡���� ����Ǵ� LogAfterAdvice�� �������ּ���!
// ���� ���ܰ� �߻��ϴ� ���Դϴ�.
// �׷��� AfterAdvice�� ������� �ֿܼ� ������ּ���!~~