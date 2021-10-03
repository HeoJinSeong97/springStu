package com.kim.app.common;

import org.aspectj.lang.JoinPoint;

public class AfterThrowingAdvice {
	public void printLog(JoinPoint jp,Exception exObj) {
		// Exception ���� ���ε�����
		String bm=jp.getSignature().getName();
		System.out.println(bm+"() �޼��带 �����ϴ� ���߿� ���ܰ� �߻���!");
		System.out.println("���ܸ޼���: "+exObj.getMessage());
		//System.out.println("�������: �ٽɷ����� �����߿� ���ܹ߻��ϸ� ȣ���");
		
		if(exObj instanceof NullPointerException) {
			System.out.println("����ÿ���");
		}
		else {
			System.out.println("Ȯ���������� �����߻�!");
		}
	}
}
