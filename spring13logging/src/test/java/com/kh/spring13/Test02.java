package com.kh.spring13;

import org.junit.Test;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Test02 {
	
//	private static final Logger log = LoggerFactory.getLogger(Test02.class);
	
	@Test
	public void test() {
		log.debug("DEBUG");
		log.info("INFORMATION");
		log.warn("WARNING");
		log.error("ERROR");
	}
}
