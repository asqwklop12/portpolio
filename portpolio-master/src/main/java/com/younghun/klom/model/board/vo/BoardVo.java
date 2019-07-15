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
	private String title;			//boardTitle
	private String writer;			//boardWriter	(F)
	private String date;			//boardDate
	  
}
