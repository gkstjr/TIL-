package com.kh.spring17;

import java.io.File;

import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
	"file:src/main/webapp/WEB-INF/spring/root-context.xml",
	"file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml"
})
@WebAppConfiguration
public class Test09 {
	
	@Autowired
	private JavaMailSender mailSender;
	
	@Test
	public void test() throws MessagingException {
	
		MimeMessage message = mailSender.createMimeMessage();
		MimeMessageHelper helper = new MimeMessageHelper(message,true,"UTF-8");

		helper.setTo("hanseok8541@gmail.com");
		helper.setSubject("첨부파일 메일 테스트");
		helper.setText("없음");
		
		File target = new File("C:\\Users\\gkstj\\image","user.png");
		DataSource source = new FileDataSource(target);
		helper.addAttachment("user.png", source);
		
		mailSender.send(message);
		
//		Resource resource = new ClassPathResource("email/email-template.html");
//		helper.addAttachment("sample.html", resource);
		
		
	}	
}
