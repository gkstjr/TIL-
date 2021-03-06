package com.kh.home.repository;

import java.util.List;

import com.kh.home.entity.BoardDto;

public interface BoardDao {

	List<BoardDto> list(String type, String keyword, int page, int size);


	int count(String type, String keyword);


	BoardDto read(int boardNo);


	boolean delete(int boardNo);


	BoardDto info(int boardNo);


	boolean edit(BoardDto boardDto);


	int write(BoardDto boardDto);

}
