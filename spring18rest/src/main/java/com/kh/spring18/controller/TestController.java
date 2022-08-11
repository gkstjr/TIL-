package com.kh.spring18.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import springfox.documentation.annotations.ApiIgnore;

@Api(tags = {"테스트용 컨트롤러"})
//@ApiIgnore
@RestController
public class TestController {

	@ApiOperation(value = "홈")
	@GetMapping("/")
	public String home() {
		return "home";
	}

	
	@ApiOperation(value = "테스트")
	@ApiResponses(value= {
			@ApiResponse(code = 500, message = "에러났어!")
		})
	@GetMapping("/test")
	public String test() {
		return "test";
	}

	@GetMapping("/param")
	public String param(@RequestParam String id) {
		return "hello" + id;
	}
}
