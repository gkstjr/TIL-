package com.kh.spring17;

import java.util.Properties;

import org.junit.Test;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;

/**
	이메일 전송
	- SMTP 프로토콜을 사용하여 메세지를 보내는 작업
	- 기존에 HTTP 기반에서 사용하던 도구들은 하나도 사용이 불가능하다(ex : @Controller)
	- 이메일을 발송하거나 수신하려면 고유의 이메일 서버가 필요하다.
	
	1. 이메일 서버를 직접 구축하여 사용(ex : Apache James)
		- 구현 난이도가 높고 스팸메일로 분류되는 문제가 발생
	2. 상용화된 이메일 서비스를 이용하는 방법(ex : GMail, Naver, Hanmail, ...)
		- 업체에서 요구하는 설정을 해야하며, 지정된 용량 이외에는 사용 불가능
		- 업체에서 서비스를 허용해줘야 가능하다
		- GMail의 경우 가입 후 2단계 인증 설정(휴대폰 인증)을 해야 가능
 */
public class Test01 {

	@Test
	public void test() {
		//단문 메일 보내기

		//1. 이메일 전송 객체 생성
		JavaMailSenderImpl sender = new JavaMailSenderImpl();

		//2. 전송객체에 전송을 위한 설정을 수행
		sender.setHost("smtp.gmail.com");//이용할 Vender의 Host 정보
		sender.setPort(587);//이용할 Vender의 Port 정보
		sender.setUsername("hanseok8541");//이용할 Vender의 사용자 계정
//		sender.setPassword("hwangtest1234!@#$");//이용할 Vender의 사용자 비밀번호
		sender.setPassword("ayxzhwilqrfwbefm");//Google에서 생성한 일회용 앱 비밀번호

		//3. 추가 정보(옵션) 설정
		Properties props = new Properties();//Map<String, String> 형태의 저장소
		props.setProperty("mail.smtp.auth", "true");//인증 여부 설정
		props.setProperty("mail.smtp.debug", "true");//디버깅 사용 여부 설정
		props.setProperty("mail.smtp.starttls.enable", "true");//TLS 사용 여부 설정
		props.setProperty("mail.smtp.ssl.protocols", "TLSv1.2");//TLS 버전 설정
		props.setProperty("mail.smtp.ssl.trust", "smtp.gmail.com");//신뢰할 수 있는 대상 추가

		sender.setJavaMailProperties(props);

		//4. 메일 메세지 생성
		SimpleMailMessage message = new SimpleMailMessage();

		message.setTo("hanseok8541@gamil.com");
		
		message.setSubject("한석아 인생 길어");
		message.setText("한석아 잘하고있다 여유를가져");

		//5. 전송
		sender.send(message);
	}

}




