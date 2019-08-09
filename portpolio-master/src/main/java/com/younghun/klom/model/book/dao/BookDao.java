package com.younghun.klom.model.book.dao;

import java.util.List;

import com.younghun.klom.model.book.vo.BookVo;

public interface BookDao {
	
	// 검색
	List<BookVo> search(int display, int post, String keyword) throws Exception;
	
	
	// 좋아요 순위
	List<BookVo> rank();
	BookVo result(String title) throws Exception;
}
