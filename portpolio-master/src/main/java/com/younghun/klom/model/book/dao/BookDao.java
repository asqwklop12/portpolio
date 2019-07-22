package com.younghun.klom.model.book.dao;

import java.util.List;

import com.younghun.klom.model.book.vo.BookVo;

public interface BookDao {
	
	// 검색
	List<BookVo> search();
}
