package com.younghun.klom.model.search.service;

import java.util.List;

import com.younghun.klom.model.search.vo.SearchListVo;

public interface SearchService {
	void delete(SearchListVo searchVo);
	
	
	List<SearchListVo> list(int display, int post, String email);
}
