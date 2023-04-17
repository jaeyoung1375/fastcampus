package com.ch4;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.ch4.dao.BoardDao;
import com.ch4.dto.BoardDto;

import lombok.extern.slf4j.Slf4j;

@SpringBootTest
@Slf4j
public class BoardTests {
	
	@Autowired
    private BoardDao boardDao;
	
//	  @Test
//	    public void countTest() throws Exception {
//	        boardDao.deleteAll();
//	        assertTrue(boardDao.count()==0);
//
//	        BoardDto boardDto = new BoardDto("no title", "no content", "asdf");
//	        assertTrue(boardDao.insert(boardDto)==1);
//	        assertTrue(boardDao.count()==1);
//
//	        assertTrue(boardDao.insert(boardDto)==1);
//	        assertTrue(boardDao.count()==2);
//	    }
//	  
//	  @Test
//	    public void deleteAllTest() throws Exception {
//	        boardDao.deleteAll();
//	        assertTrue(boardDao.count()==0);
//
//	        BoardDto boardDto = new BoardDto("no title", "no content", "asdf");
//	        assertTrue(boardDao.insert(boardDto)==1);
//	        assertTrue(boardDao.deleteAll()==1);
//	        assertTrue(boardDao.count()==0);
//
//	        boardDto = new BoardDto("no title", "no content", "asdf");
//	        assertTrue(boardDao.insert(boardDto)==1);
//	        assertTrue(boardDao.insert(boardDto)==1);
//	        assertTrue(boardDao.deleteAll()==2);
//	        assertTrue(boardDao.count()==0);
//	    }
//	  
//	   @Test
//	    public void deleteTest() throws Exception {
//	        boardDao.deleteAll();
//	        assertTrue(boardDao.count()==0);
//
//	        BoardDto boardDto = new BoardDto("no title", "no content", "asdf");
//	        assertTrue(boardDao.insert(boardDto)==1);
//	        Integer bno = boardDao.selectAll().get(0).getBno();
//	        assertTrue(boardDao.delete(bno, boardDto.getWriter())==1);
//	        assertTrue(boardDao.count()==0);
//
//	        assertTrue(boardDao.insert(boardDto)==1);
//	        bno = boardDao.selectAll().get(0).getBno();
//	        assertTrue(boardDao.delete(bno, boardDto.getWriter()+"222")==0);
//	        assertTrue(boardDao.count()==1);
//
//	        assertTrue(boardDao.delete(bno, boardDto.getWriter())==1);
//	        assertTrue(boardDao.count()==0);
//
//	        assertTrue(boardDao.insert(boardDto)==1);
//	        bno = boardDao.selectAll().get(0).getBno();
//	        assertTrue(boardDao.delete(bno+1, boardDto.getWriter())==0);
//	        assertTrue(boardDao.count()==1);
//	    }
//	   
//	    @Test
//	    public void insertTest() throws Exception {
//	        boardDao.deleteAll();
//	        BoardDto boardDto = new BoardDto("no title", "no content", "asdf");
//	        assertTrue(boardDao.insert(boardDto)==1);
//
//	        boardDto = new BoardDto("no title", "no content", "asdf");
//	        assertTrue(boardDao.insert(boardDto)==1);
//	        assertTrue(boardDao.count()==2);
//
//	        boardDao.deleteAll();
//	        boardDto = new BoardDto("no title", "no content", "asdf");
//	        assertTrue(boardDao.insert(boardDto)==1);
//	        assertTrue(boardDao.count()==1);
//	    }
//	    
//	    @Test
//	    public void selectAllTest() throws Exception {
//	        boardDao.deleteAll();
//	        assertTrue(boardDao.count()==0);
//
//	        List<BoardDto> list = boardDao.selectAll();
//	        assertTrue(list.size() == 0);
//
//	        BoardDto boardDto = new BoardDto("no title", "no content", "asdf");
//	        assertTrue(boardDao.insert(boardDto)==1);
//
//	        list = boardDao.selectAll();
//	        assertTrue(list.size() == 1);
//
//	        assertTrue(boardDao.insert(boardDto)==1);
//	        list = boardDao.selectAll();
//	        assertTrue(list.size() == 2);
//	    }
	    
	    @Test
	    public void selectTest() throws Exception {
	        boardDao.deleteAll();
	        assertTrue(boardDao.count()==0);

	        BoardDto boardDto = new BoardDto("no title", "no content", "asdf");
	        assertTrue(boardDao.insert(boardDto)==1);

	        Integer bno = boardDao.selectAll().get(0).getBno();
	        boardDto.setBno(bno);
	        BoardDto boardDto2 = boardDao.selectOne(bno);
	       
	    }
	

}
