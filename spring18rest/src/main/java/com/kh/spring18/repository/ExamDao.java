package com.kh.spring18.repository;

import java.util.List;

import com.kh.spring18.entity.ExamDto;

public interface ExamDao {

	ExamDto insert(ExamDto examDto);

	List<ExamDto> list();
	List<ExamDto> search(String type, String keyword);

	ExamDto info(long examId);

	ExamDto edit(ExamDto examDto);

	void delete(long examId);


}
