package com.younghun.klom.model.book.service;

import java.util.List;

import com.younghun.klom.model.book.vo.BookVo;

public interface BookService {

	// 검색
	List<BookVo> search(int display, int post, String keyword) throws Exception;

	// 좋아요 순위
	List<BookVo> rank() throws Exception;

	BookVo result(String title) throws Exception;
}
