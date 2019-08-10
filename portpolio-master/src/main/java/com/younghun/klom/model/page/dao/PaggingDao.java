package com.younghun.klom.model.page.dao;

import com.younghun.klom.model.page.vo.SearchVo;
import com.younghun.klom.model.search.dto.SearchDto;

public interface PaggingDao {

	// board
	int board();
	
	// book
	int book(SearchVo searchVo);
				
	// searchList
	int search(SearchDto searchDto);
}
