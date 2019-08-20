package com.younghun.klom.model.book.dao;

import java.util.List;

import com.younghun.klom.model.book.vo.BookVo;
import com.younghun.klom.model.page.vo.SearchVo;

public interface BookDao {
	
	// 검색
	List<BookVo> search(SearchVo searchVo) throws Exception;
	
	
	// 좋아요 순위
	List<BookVo> rank();
	BookVo result(String title) throws Exception;
	
	void insertBasic(BookVo bookVo) throws Exception;
	
	void insertDetail(BookVo bookVo) throws Exception;
}
