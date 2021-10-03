package com.kim.view.common;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice("com.kim.view")
public class CommonExceptionHandler {

	/*@ExceptionHandler(AException.class)
	public ModelAndView handlerAException(Exception e) {
		ModelAndView mav=new ModelAndView();
		mav.addObject("exception",e);
		mav.setViewName("errorA.jsp");
		return mav;
	}*/	
	
	@ExceptionHandler(Exception.class)
	public ModelAndView handlerException(Exception e) {
		ModelAndView mav=new ModelAndView();
		mav.addObject("exception",e);
		mav.setViewName("/controllError/error.jsp");
		return mav;
	}
	
}
