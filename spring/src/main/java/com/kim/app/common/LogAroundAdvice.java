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
		System.out.println(bm+"()메서드의 수행시간은 "+sw.getTotalTimeMillis());
		return obj;
	}
}
// 모든 핵심비즈니스 메서드에 대해서
// 그 수행시간을 출력해주는 LogAroundAdvice의 printLog() 횡단관심메서드를 구현해주세요!~~
