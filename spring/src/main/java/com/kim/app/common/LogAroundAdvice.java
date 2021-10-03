package com.kim.app.common;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Service;
import org.springframework.util.StopWatch;

@Service
@Aspect
public class LogAroundAdvice {
	@Around("PointcutTest.aPointcut()")
	public Object printLog(ProceedingJoinPoint pjp) throws Throwable {
		StopWatch sw=new StopWatch();
		sw.start();
		Object obj=pjp.proceed();
		sw.stop();
		
		String bm=pjp.getSignature().getName();
		System.out.println(bm+"()�޼����� ����ð��� "+sw.getTotalTimeMillis());
		return obj;
	}
}
// ��� �ٽɺ���Ͻ� �޼��忡 ���ؼ�
// �� ����ð��� ������ִ� LogAroundAdvice�� printLog() Ⱦ�ܰ��ɸ޼��带 �������ּ���!~~
