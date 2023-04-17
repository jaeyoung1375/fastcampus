package com.ch4;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.ch4.vo.PageHandler;

@SpringBootTest
public class PageHandlerTest {
	
	@Test
	public void test() {
		PageHandler ph = new PageHandler(255,25);
		ph.print();
		System.out.println("ph = "+ph);
		assertTrue(ph.getBeginPage() == 1);
		assertTrue(ph.getEndPage() == 10);
	}

}
