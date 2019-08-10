package com.younghun.klom.model.search.dto;

import com.younghun.klom.model.page.vo.PageVo;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class SearchDto extends PageVo{

	private String userEmail;
}
