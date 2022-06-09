package com.kh.spring12;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	@GetMapping("/")
	public String home() {
		return "home";
	}
	@GetMapping("/test")
	public String test() {
		return "test";
	}
	@GetMapping("/test/a")
	public String testA() {
		return "testA";
	}
	@GetMapping("/test/b")
	public String testB() {
		return "testB";
	}
}
