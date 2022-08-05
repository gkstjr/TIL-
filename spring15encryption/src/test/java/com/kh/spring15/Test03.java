package com.kh.spring15;

import org.junit.Test;

import lombok.extern.log4j.Log4j;
import lombok.extern.slf4j.Slf4j;
@Slf4j
public class Test03 {
	
//	단방향 암호화
// - 의도적으로 원본값에 손실을 발생시켜 원본을 유추할 수 없도록 만드는 암호화 방식
// - 서로 다른값이 손실 발생 후 같은 값이 되는 경우가 발생하면 안된다(충돌,crash) 
// - MD5, SH4 ,RSA , Scrypt, Bcrypt 등이 있다
// - 충돌과 추리를 방지하기 위해 자리수가 비정상적으로 늘어나도록 설계되어 있다.	

	@Test
	public void test() {
		int before = 1235;
		
		int after = before;
		after += 5;
		after *= 234;
		after <<= 5;
		after %= 100000000;
		
		log.debug("before = {}",before);
		log.debug("after = {}",after);
		
		
	}
}
