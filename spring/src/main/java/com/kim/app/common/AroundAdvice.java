package com.kim.app.common;

import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.util.StopWatch;

public class AroundAdvice {
	public Object printLog(ProceedingJoinPoint pjp) throws Throwable {
		StopWatch sw=new StopWatch();
		sw.start();
		Object obj=pjp.proceed();
		sw.stop();
		String bm=pjp.getSignature().getName();
		System.out.println(bm+"()메서드의 수행시간은 "+sw.getTotalTimeMillis());
		return obj;
		/*
		System.out.println("[before]");
		StopWatch sw=new StopWatch();
		
		sw.start();
		Object obj=pjp.proceed();
		sw.stop();
		
		System.out.println("[after]");
		String bm=pjp.getSignature().getName();
		System.out.println(bm+"() 메서드가 수행된 시간은 "+sw.getTotalTimeMillis());
		return obj;
		*/
	}
}
