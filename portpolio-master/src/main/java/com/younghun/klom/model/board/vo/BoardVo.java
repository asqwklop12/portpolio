package com.younghun.klom.model.board.vo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class BoardVo {
  
	// BoardInfo
	private int no;			       //boardId	(P)
	private String userEmail;		//UserEmail	(F)
	private String title;			//boardTitle
	private String writer;			//boardWriter	
	private String content;			//boardContent
	private String date;			//boardDate
	private int boardLike;			//boardLike
	private int boardView;			//boardView
	private int recent;				// **게시글 댓글 수 추가 
	  
}
