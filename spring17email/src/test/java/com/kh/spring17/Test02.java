package com.kh.spring17;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
	"file:src/main/webapp/WEB-INF/spring/root-context.xml",
	"file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml"
})
@WebAppConfiguration
public class Test02 {

	@Autowired
	private JavaMailSender mailSender;

	@Test
	public void test() {
		SimpleMailMessage message = new SimpleMailMessage();
		message.setTo("hanseok8541@gmail.com");
		message.setSubject("이번주 로또번호 무료로 알려드립니다!");
		message.setText("힝 속았지");
		mailSender.send(message);
	}

}


