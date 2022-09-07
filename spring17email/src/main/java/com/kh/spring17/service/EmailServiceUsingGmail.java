package com.kh.spring17.service;

import java.text.DecimalFormat;
import java.text.Format;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.kh.spring17.entity.CertDto;
import com.kh.spring17.repository.CertDao;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class EmailServiceUsingGmail implements EmailService {

	@Autowired
	private JavaMailSender mailSender;

	@Autowired
	private CertDao certDao;

	private Random r = new Random();
	private Format f = new DecimalFormat("000000");

	@Override
	public void sendCertification(String email) {
		//인증번호 전송 시스템
		//1. 랜덤으로 6자리의 정수를 생성한다
		//2. 특정 이메일로 인증번호를 발송한다
		//2-1. 이메일과 인증번호, 전송시각을 DB에 저장한다
		//3. 사용자가 이메일을 확인해서 인증번호를 입력한다
		int certNumber = r.nextInt(1000000);
		String certString = f.format(certNumber);
		log.debug("인증번호 = {}", certString);

		String title = "[KH정보교육원] 인증번호를 보내드립니다";
		String content = "인증번호 : "+certString;

		SimpleMailMessage message = new SimpleMailMessage();
		message.setTo(email);
		message.setSubject(title);
		message.setText(content);

		mailSender.send(message);

		//DB에 인증정보를 저장하는 코드
		//- 1개의 이메일에는 1개의 인증번호만 가능하므로 검사하여 수정 혹은 추가를 해야 한다

		certDao.insert(CertDto.builder()
												.certTarget(email)
												.certNumber(certString)
												.build());
	}

}