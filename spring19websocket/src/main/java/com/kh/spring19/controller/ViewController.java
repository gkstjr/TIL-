package com.kh.spring19.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ViewController {

	@GetMapping("/")
	public String home() {
		return "home";
	}
	
	@GetMapping("/default")
	public String def() {
		return "default";
	}
	@GetMapping("/timing")
	public String timing() {
		return "timing";
	}
	@GetMapping("/simple")
	public String simple() {
		return "simple";
	}
	@GetMapping("/multiuser")
	public String multiuser() {
		return "multiuser";
	}
	@GetMapping("/chatbot")
	public String chatbot() {
		return "chatbot";
	}
}
