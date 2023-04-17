package com.ch4.dto;




import java.sql.Date;

import lombok.Data;

@Data
public class BoardDto {
	
	 private Integer bno;
	 private String  title;
	 private String  content;
	 private String  writer;
	 private int viewCnt;
     private int commentCnt;
	 private Date regDate;
	 private Date upDate;
	 
	 public BoardDto(String title, String content, String writer) {
		 this.title = title;
		 this.content = content;
		 this.writer = writer;
	 }
}
