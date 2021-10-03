package com.kim.app.common;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class PointcutTest {
	@Pointcut("execution(* com.kim.app..*Impl.*(..))")
	public void aPointcut() {}

	@Pointcut("execution(* com.kim.app..*Impl.get*(..))")
	public void bPointcut() {}
}
