package com.kh.spring12.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class TestInterceptor implements HandlerInterceptor {
	@Override
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response,
			Object handler)
			throws Exception {
			System.out.println("preHandle");
			System.out.println(handler);

			return true;
	}

	@Override
	public void postHandle(HttpServletRequest request,
			HttpServletResponse response,
			Object handler,
			ModelAndView modelAndView) throws Exception {
		System.out.println("postHandle");
		System.out.println(handler);
		System.out.println(modelAndView);
	}
	@Override
	public void afterCompletion(HttpServletRequest request,
			HttpServletResponse response,
			Object handler,
			Exception ex)
			throws Exception {
		System.out.println("afterCompletion");
		System.out.println(handler);
		System.out.println(ex);
		if(ex != null) {
			System.out.println("예외 발생");
		}
	}
}
