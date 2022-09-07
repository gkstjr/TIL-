package com.kh.spring15;

import org.junit.Test;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Test01 {

	@Test
	public void test() {
		int before = 100;
		int offset = 13;
		int after = before + offset;

//		log.debug("암호화 전 = " + before);
//		log.debug("암호화 후 = " + after);
		log.debug("암호화 전 = {}", before);
		log.debug("암호화 후 = {}", after);
	
		int restore = after - offset;
		
		log.debug("복호화 전 = " + after);
		log.debug("복호화 후 = " + restore);
	}

	@Test
	public void test2() {
		String before = "hello java";
		int offset = 1;
		
		StringBuffer after = new StringBuffer();
		for(int i = 0 ; i < before.length(); i++) {
			char ch = before.charAt(i);
			ch += offset;
			after.append(ch);
		}
		log.debug("before = {}", before);
		log.debug("after = {}", after);
		
	}
}
