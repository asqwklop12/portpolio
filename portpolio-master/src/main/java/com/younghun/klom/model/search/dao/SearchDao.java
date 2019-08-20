package com.younghun.klom.model.search.dao;

import java.util.List;

import com.younghun.klom.model.search.dto.SearchDto;
import com.younghun.klom.model.search.vo.SearchListVo;

public interface SearchDao {

	void insert(SearchListVo searchVo);
	
	List<SearchListVo> list(SearchDto searchDto);
	
	void delete(SearchListVo searchVo);
	
	
	int user(String email);
	
	void updateGroup(SearchListVo searchVo);
	
}
