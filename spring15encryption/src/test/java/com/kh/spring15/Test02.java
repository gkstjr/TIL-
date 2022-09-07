package com.kh.spring15;

import org.junit.Test;

import lombok.extern.slf4j.Slf4j;
@Slf4j
public class Test02 {

	@Test
	public void test() {
		int before = 7;
		int mask = 4;
		int after = before ^ mask;
		
		log.debug("before = " + before);
		log.debug("after = {}",after);
		
		int restore = after ^ mask;
		
		log.debug("restore = {}",restore);
	}

	@Test
	public void test2() {
		String before = "hello java";
		int mask = 1;
		StringBuffer after = new StringBuffer();
		for(int i =0; i< before.length(); i++) {
			char ch = before.charAt(i);
			ch ^= mask;
			after.append(ch);
		}
	
			log.debug("before = {}",before);
			log.debug("after = {}",after);
	}
}
