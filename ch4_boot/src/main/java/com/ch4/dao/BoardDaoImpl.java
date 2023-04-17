package com.ch4.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ch4.dto.BoardDto;

@Repository
public class BoardDaoImpl implements BoardDao {
	
	@Autowired
	private SqlSession sqlSession;

	@Override
	public BoardDto selectOne(Integer bno) {
		
		return sqlSession.selectOne("board.selectOne",bno);
	}

	@Override
	public int delete(Integer bno, String writer) {
		
		Map<String,Object> map = new HashMap<>();
		map.put("bno", bno);
		map.put("writer", writer);
		
		return sqlSession.delete("board.delete",map);
	}

	@Override
	public int insert(BoardDto dto) {
		
		return sqlSession.insert("board.insert",dto);
	}

	@Override
	public int update(BoardDto dto) {
		
		return sqlSession.update("board.update",dto);
	}

	@Override
	public int increaseViewCnt(Integer bno) {
		
		return sqlSession.update("board.increaseViewCnt",bno);
	}

	@Override
	public List<BoardDto> selectAll() {
		
		return sqlSession.selectList("board.selectAll");
	}

	@Override
	public int count() {
		
		return sqlSession.selectOne("board.count");
	}

	@Override
	public int deleteAll() {
		
		return sqlSession.delete("board.deleteAll");
	}

}
