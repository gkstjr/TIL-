package com.kh.spring12;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.kh.spring12.interceptor.LoginUserOnly;

@Controller
public class HomeController {
	@LoginUserOnly
	@GetMapping("/")
	public String home() {
		return "home";
	}
	@GetMapping("/test")
	public String test() {
		return "test";
	}
	@LoginUserOnly
	@GetMapping("/test/a")
	public String testA() {
		return "testA";
	}
	@GetMapping("/test/b")
	public String testB() {
		return "testB";
	}
}
