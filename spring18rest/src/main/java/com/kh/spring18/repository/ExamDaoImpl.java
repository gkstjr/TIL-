package com.kh.spring18.repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kh.spring18.entity.ExamDto;
import com.kh.spring18.error.CannotFindException;
@Repository
public class ExamDaoImpl implements ExamDao {

	@Autowired
	private SqlSession sqlSession;
	
	@Override
	public ExamDto insert(ExamDto examDto) {
//		1. 선등록 후조회
//		2. 선조회(번호) 후등록
		long examId = sqlSession.selectOne("exam.sequence");
		examDto.setExamId(examId);
		sqlSession.insert("exam.insert",examDto);
		return examDto;
		
	}

	@Override
	public List<ExamDto> list() {
		return sqlSession.selectList("exam.list");
	}

	@Override
	public ExamDto info(long examId) {
		ExamDto examDto = sqlSession.selectOne("exam.one",examId);
		if(examDto == null) {
			throw new CannotFindException();
		}
		else {
			return examDto;
		}
	}
	@Override
	public ExamDto edit(ExamDto examDto) {
		int count = sqlSession.update("exam.edit",examDto);
		if(count == 0) {
			throw new CannotFindException();
		}
		return sqlSession.selectOne("exam.one",examDto.getExamId());
	}
	@Override
	public void delete(long examId) {
		int count = sqlSession.delete("exam.delete",examId);
		if(count == 0) {
			throw new CannotFindException();
		}
	}

	@Override
	public List<ExamDto> search(String type, String keyword) {
		Map<String,Object> param = new HashMap<>();
		param.put("type",type);
		param.put("keyword",keyword);
		
		List<ExamDto> list =  sqlSession.selectList("exam.search",param);
		if(list.isEmpty()) {
			throw new CannotFindException();
		}
		else {
			return list;
		}
	}
}
