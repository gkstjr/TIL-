package com.kh.spring17;

import java.text.DecimalFormat;
import java.text.Format;
import java.util.Random;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.kh.spring17.entity.CertDto;
import com.kh.spring17.repository.CertDao;
import com.kh.spring17.service.EmailService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
	"file:src/main/webapp/WEB-INF/spring/root-context.xml",
	"file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml"
})
@WebAppConfiguration
public class Test05 {

	@Autowired
	private EmailService emailService;

	@Test
	public void test() {
		emailService.sendCertification("hwang8243@gmail.com");
	}

}
