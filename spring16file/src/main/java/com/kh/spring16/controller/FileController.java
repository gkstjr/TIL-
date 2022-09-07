package com.kh.spring16.controller;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.FileUtils;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.http.ContentDisposition;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.kh.spring16.entity.MemberDto;

import lombok.extern.slf4j.Slf4j;
@Slf4j
@Controller
public class FileController {

	@RequestMapping("/")
	public String home() {
		return "home";
	}

	@PostMapping("/upload")
	public String upload(@RequestParam MultipartFile attach) {
		log.debug("attach = {}", attach);
		return "redirect:/";
	}

	@PostMapping("/upload2")
	public String upload(@RequestParam List<MultipartFile> attach) {
		log.debug("업로드 된 파일 수 = {}",attach.size());
		for(MultipartFile file : attach) {
			log.debug("file = {}" , file);
			
		}
		return "redirect:/";
	}


	@PostMapping("/upload3")
	public String upload (
			@ModelAttribute MemberDto memberDto,
			@RequestParam MultipartFile attach) throws IllegalStateException, IOException {
		//(중요)파일이 업로드 되지 않더라도 attach는 null이 아니므로 따로 검사를 수행해야한다
		log.debug("MemberDto = {}",memberDto);
		log.debug("attach = {}",attach);
		log.debug("파일이 업로드 되었나요? {}", !attach.isEmpty());
		
		if(!attach.isEmpty()) {
			log.debug("origin file name = {}",attach.getOriginalFilename());
			log.debug("content type = {}", attach.getContentType());
			log.debug("content size = {}", attach.getSize());
			
			//저장 : 자바의 IO패키지를 사용(파일 객체가 필요)
			File dir = new File(System.getProperty("user.home")+"/upload");
			log.debug("dir = {}", dir.getAbsolutePath());
			dir.mkdirs();
			File target = new File(dir,attach.getOriginalFilename());
			attach.transferTo(target);
			
			
		}
		
		return "redirect:/";
	}
	
	//사용자에게 업로드 폴더에 있는 이미지를 다운로드 시켜주는 매핑을 구현
	@GetMapping("/download")
	public void download(HttpServletResponse response) throws IOException {
		//1. 파일 객체를 준비한다
		File dir = new File(System.getProperty("user.home")+"/upload");
		File target = new File(dir,"dice1.jpg");
		if(!target.exists()) return;
		
//		2. 응답 헤더 설정
		response.setHeader("Context-Type", "application/octet-stream");
		response.setHeader("Content-Encoding",	"UTF-8");
		response.setHeader("Content-Length", String.valueOf(target.length()));
		response.setHeader("Content-Disposition", "attachment; filename=dice1.jpg");
		
//		3.전송
		byte[] data = FileUtils.readFileToByteArray(target);
		response.getOutputStream().write(data);
	}
		
		
		@GetMapping("/download2")
		@ResponseBody
		public ResponseEntity<ByteArrayResource> download2() throws Exception {
			//1. 파일 객체를 준비한다
			File dir = new File(System.getProperty("user.home")+"/upload");
			File target = new File(dir,"dice1.jpg");
			if(!target.exists())
				throw new Exception();
		
			//2. 응답 객체를 만들어서 반환
			byte[] data = FileUtils.readFileToByteArray(target);
			ByteArrayResource resource = new ByteArrayResource(data);
			
			
			return ResponseEntity.ok()
						.contentType(MediaType.APPLICATION_OCTET_STREAM)
						.contentLength(target.length())
						.header(HttpHeaders.CONTENT_ENCODING, StandardCharsets.UTF_8.name())
						.header(HttpHeaders.CONTENT_DISPOSITION,
								ContentDisposition.builder("attachment")
								.filename("dice1.jpg")
								.build()
								.toString()
								)
						.body(resource);
	}
	
}
