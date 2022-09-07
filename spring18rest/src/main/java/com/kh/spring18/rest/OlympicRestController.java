package com.kh.spring18.rest;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kh.spring18.entity.OlympicDto;
import com.kh.spring18.error.CannotFindException;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

//ex : Olympic 기능을 구현하기 위한 백엔드 REST API를 구현

@Api(tags = "올림픽 정보 관리 시스템")
@RestController
@RequestMapping("/olympic")
public class OlympicRestController {
	
	@Autowired
	private SqlSession sqlSession;

	//등록(Create) - POST방식으로 구현
	@ApiOperation(value = "등록")
	@ApiResponses(value = {
		@ApiResponse(code = 500, message = "이미 등록된 국가명입니다")
	})
	@PostMapping("/")
	public OlympicDto insert(@ModelAttribute OlympicDto olympicDto) {
		sqlSession.insert("olympic.insert", olympicDto);
		//return olympicDto;
		return sqlSession.selectOne("olympic.one", olympicDto.getName());
	}
	
	//조회(Read) - GET방식으로 구현
	@ApiOperation(value = "목록조회", produces = "application/json")
	@GetMapping("/")
	public List<OlympicDto> list() {
		return sqlSession.selectList("olympic.list");
	}
	
	@ApiOperation(value = "단일조회")
	@ApiResponses(value = {
		@ApiResponse(code = 404, message = "해당하는 국가가 존재하지 않는 경우")
	})
	@GetMapping("/{name}")
	public OlympicDto one(@PathVariable String name) {
		//return sqlSession.selectOne("olympic.one", name);//없는 경우도 성공으로 처리됨
		OlympicDto olympicDto = sqlSession.selectOne("olympic.one", name);
		if(olympicDto == null) {
			throw new CannotFindException();//404 error 처리
		}
		else {
			return olympicDto;
		}
	}
	
	//수정(Update) - PUT방식으로 구현(POST방식과 구조가 같음)
	//(시나리오)
	//수정 ---(성공)---> 다시 조회해서 반환
	//       ---(실패)---> CannotFindException 발생 ---(간섭)---> 404 error
	@ApiOperation(value = "국가 정보 수정")
	@ApiResponses(value = {
		@ApiResponse(code = 404, message = "해당하는 국가가 존재하지 않는 경우")
	})
	@PutMapping("/")
	public OlympicDto update(@ModelAttribute OlympicDto olympicDto) {
		int count = sqlSession.update("olympic.update", olympicDto);
		if(count == 0) {
			throw new CannotFindException();
		}
		else {
			return sqlSession.selectOne("olympic.one", olympicDto.getName());
		}
	}
	
	//삭제(Delete) - DELETE 방식으로 구현(GET 방식과 동일)
	@ApiOperation(value = "국가 삭제")
	@ApiResponses(value = {
		@ApiResponse(code = 404, message = "해당하는 국가가 존재하지 않는 경우")
	})
	@DeleteMapping("/{name}")
	public void delete(@PathVariable String name){
		int count = sqlSession.delete("olympic.delete", name);
		if(count == 0) {
			throw new CannotFindException();
		}
	}
}
