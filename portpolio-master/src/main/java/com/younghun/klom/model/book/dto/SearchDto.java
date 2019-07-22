package com.younghun.klom.model.book.dto;

import com.younghun.klom.model.Pagging;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class SearchDto extends Pagging{

	private String keyword;
	
	public SearchDto(int total, int count) {
		super(total, count);
	}
	
}
