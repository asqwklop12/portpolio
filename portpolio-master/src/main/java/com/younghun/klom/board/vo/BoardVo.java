package com.younghun.klom.board.vo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BoardVo {
	private int id;
	private String title;
	private String writer;
	private String date;
	private int view;
	private int like;
	private int share;
}
