package com.kh.spring13;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Test01 {
	
	private Logger log = LoggerFactory.getLogger(Test01.class);
	
	@Test
	public void test() {
//        로깅(Logging)
//		  - 로그(log)를 남기는 행위
//		  - 대표적으로 System.out, System.err을 이용하는 것도 이에 해당함
//			- 출력 대상이 항상 콘솔임
//			- 출력을 원할 떄만 하도록 할 수 없다
//			- 메세지의 종류(중요도)를 구분할 수 없다
//			- 대표적인 로깅 라이브러리는 log4j , logback 등이 존재한다
			
		System.out.println("로그 생성");
		System.err.println("로그 생성");
		
		//Logging은 수준(level)별로 가능하다.
		
		log.trace("TRACE 메세지");
		log.debug("DEBUG 메세지");
		log.info("INFO 메세지");
		log.warn("WARN 메세지");
		log.error("ERROR 메세지");
		
}
}
