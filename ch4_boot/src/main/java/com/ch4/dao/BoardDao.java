package com.ch4.dao;

import java.util.List;

import com.ch4.dto.BoardDto;

public interface BoardDao {
	
	BoardDto selectOne(Integer bno);
	List<BoardDto> selectAll();
	int delete(Integer bno, String writer);
	int insert(BoardDto dto);
	int update(BoardDto dto);
	int increaseViewCnt(Integer bno);
	int count();
	int deleteAll();
	
	
}
