package com.kh.spring18.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kh.spring18.entity.ExamDto;
import com.kh.spring18.repository.ExamDao;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@Api(tags = "시험 성적 관리 시스템")
@RestController
@RequestMapping("/exam")
public class ExamRestController {
	
	@Autowired
	private ExamDao examDao;
	
	@ApiOperation(value = "시험정보 등록")
	@ApiResponses(value = {
		@ApiResponse(code = 500, message = "데이터베이스와 일치하지 않는 데이터 형태")
	})
	@PostMapping("/")
//	public ExamDto insert(@ModelAttribute ExamDto examDto) {//form-data
	public ExamDto insert(@RequestBody ExamDto examDto) {//JSON or String
		return examDao.insert(examDto);
	}
	
	@ApiOperation(value = "시험정보 조회")
	@ApiResponses(value = {
		@ApiResponse(code = 500, message = "데이터베이스 연결 오류")
	})
	@GetMapping("/")
	public List<ExamDto> list(){
		return examDao.list();
	}
	
	@GetMapping("/type/{type}/keyword/{keyword}")
	public List<ExamDto> search(@PathVariable String type, @PathVariable String keyword){
		return examDao.search(type, keyword);
	}
	
	@ApiOperation(value = "시험정보 단일조회")
	@ApiResponses(value = {
		@ApiResponse(code = 404, message = "조회 결과가 존재하지 않는 경우"),
		@ApiResponse(code = 500, message = "데이터베이스 연결 오류")
	})
	@GetMapping("/examId/{examId}")
	public ExamDto find(@PathVariable long examId) {
		return examDao.info(examId);
	}
	
	@ApiOperation(value = "시험정보 수정")
	@ApiResponses(value = {
		@ApiResponse(code = 404, message = "조회 결과가 존재하지 않는 경우"),
		@ApiResponse(code = 500, message = "데이터베이스 연결 오류")
	})
	@PutMapping("/")
	public ExamDto edit(@RequestBody ExamDto examDto) {
		return examDao.edit(examDto);
	}
	
	@DeleteMapping("/{examId}")
	public void delete(@PathVariable long examId) {
		examDao.delete(examId);
	}
	
}