package com.kh.spring15;

import org.junit.Test;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.Pbkdf2PasswordEncoder;
import org.springframework.security.crypto.password.StandardPasswordEncoder;

import lombok.extern.slf4j.Slf4j;

//StandardPasswordEncoder : SHA-256 알고리즘을 이용하여 단방향 암호화를 해주는 클래스
//Pbkdf2PasswordEncoder : 공격 방지를 위해 의도적으로 단방향 암호화를 느리게 해주는 클래스
//BCryptPasswordEncoder : 시간을 추가하여 매번 다른 단방향 암호화를 해주는 클래스

@Slf4j
public class Test04 {

//	@Test
	public void test1() {
		String before = "hello java";
		StandardPasswordEncoder encoder = new StandardPasswordEncoder();
		String after = encoder.encode(before);

		log.debug("before = {}", before);
		log.debug("after = {}", after);

		boolean match = encoder.matches(before, after);
		log.debug("match = {}", match);
	}

//	@Test
	public void test2() {
		String before = "hello java";
		Pbkdf2PasswordEncoder encoder = new Pbkdf2PasswordEncoder();
		String after = encoder.encode(before);

		log.debug("before = {}", before);
		log.debug("after = {}", after);

		boolean match = encoder.matches(before, after);
		log.debug("match = {}", match);
	}

	@Test
	public void test3() {
		String before = "hello java";
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		String after = encoder.encode(before);

		log.debug("before = {}", before);
		log.debug("after = {}", after);

		boolean match = encoder.matches(before, after);
		log.debug("match = {}", match);
	}

}