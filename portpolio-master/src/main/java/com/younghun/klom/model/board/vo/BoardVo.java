package com.younghun.klom.model.board.vo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class BoardVo {

	// BoardInfo
	private Long no;			    //boardId	(P)
	private int userId;		    //UserId	(F)
	private String title;			//boardTitle
	private String writer;			//boardWriter	
	private String content;			//boardContent
	private String date;			//boardDate
	private int recent;				// **게시글 댓글 수 추가 
	  
}
