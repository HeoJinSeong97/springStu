package com.kim.app.common;

import org.aspectj.lang.JoinPoint;

public class BeforeAdvice {
	public void printLog(JoinPoint jp) {
		String bm=jp.getSignature().getName();
		System.out.println(bm+"()�޼��尡 ȣ���");
		System.out.println("���ڷδ�...");
		Object[] args=jp.getArgs();
		for(Object v:args) {
			System.out.println(v);
		}
		System.out.println("...����߿�����");
		/*
		// �����̽� �޼��忡�� jp ��ü�� ����Ϸ���
		// �޼��� �Ű������� ���� �ϸ�ȴ�!
		// => ������ �����̳ʰ� jp ��ü�� �ڵ����� �����Ѵ�!
		String bm=jp.getSignature().getName();
		Object[] args=jp.getArgs();
		System.out.println("Ŭ���̾�Ʈ �޼��� �������...");
		System.out.println("�̿��ϴ� �޼���: "+bm);
		System.out.println("�̿��ϴ� �Ű�������...");
		for(Object v:args) {
			System.out.println(v);
		}
		System.out.println("----------");
		//System.out.println("�������: �ٽɷ����� �����ϱ����� ȣ���");
		*/
	}
}
