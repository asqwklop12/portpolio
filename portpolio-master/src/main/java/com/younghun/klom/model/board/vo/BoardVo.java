package com.younghun.klom.model.board.vo;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter  
public class BoardVo {
	private int boardId;
	private String userEmail;
	private String boardProfile;
	private String boardWriter;
	private String boardContent;
	private String boardTitle;
	private String boardDate;
	private int boardView;
	
}
