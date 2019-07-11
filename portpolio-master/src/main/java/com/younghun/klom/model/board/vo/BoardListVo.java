package com.younghun.klom.model.board.vo;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class BoardListVo {
	private int id;
	private String title;
	private String writer;
	private String date;
	private int view;
	private int like;
	private int share;
}
