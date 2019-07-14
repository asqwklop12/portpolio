package com.younghun.klom.model.board.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class DetailDto {

	private long no;					// PrimaryKey(BoardId)
	private String title;				// BoardTitle
	private String writer;				// ForiegnKey(BoardWriter -> UserInfo(UserName))
	private String image;				// 현재 사용 불가 UserImage
	private String content;				// BoardContent
}	
