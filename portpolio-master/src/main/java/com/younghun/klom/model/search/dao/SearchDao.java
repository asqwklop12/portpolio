package com.younghun.klom.model.search.dao;

import java.util.List;

import com.younghun.klom.model.search.vo.SearchVo;

public interface SearchDao {

	void insert(SearchVo searchVo);
	
	List<SearchVo> list(String email);
	
	void delete(SearchVo searchVo);
	
	
	int user(String email);
	int max();
	
	void updateId(int id);
	void updateGroup(SearchVo searchVo);
	
}
