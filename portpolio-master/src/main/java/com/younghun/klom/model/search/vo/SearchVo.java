package com.younghun.klom.model.search.vo;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class SearchVo {

	private int SearchId;
	private String userEmail;
	private String bookTitle;
	private String searchAuthor;
	private String searchPublisher;
}
