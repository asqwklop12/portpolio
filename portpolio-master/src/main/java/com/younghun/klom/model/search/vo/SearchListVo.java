package com.younghun.klom.model.search.vo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class SearchListVo {

	private int searchId;
	private int searchNumber;
	private String userEmail;
	private String bookTitle;
	private String searchAuthor;
	private String searchPublisher;
	
	private int maxId;    //전체 최대값
	private int maxNum;    //유저별 최대값
}
