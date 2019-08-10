package com.younghun.klom.model.book.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.younghun.klom.model.book.dao.BookDao;
import com.younghun.klom.model.book.vo.BookVo;
import com.younghun.klom.model.page.vo.SearchVo;

import lombok.extern.slf4j.Slf4j;


@Service
@Slf4j
public class BookServiceImpl implements BookService{

	@Autowired
	private BookDao bookDao;
	
	@Override
	public List<BookVo> search(int display, int post, String keyword) throws Exception {
		SearchVo searchVo = new SearchVo();
		searchVo.setDisplay(display);
		searchVo.setPost(post);
		searchVo.setKeyword(keyword);
		List<BookVo> list = bookDao.search (searchVo);
		log.debug("{}",list);
		return bookDao.search(searchVo);
	}

	@Override
	public BookVo result(String title) throws Exception {
		return bookDao.result(title);
	}

	@Override
	public List<BookVo> rank() {
		return bookDao.rank();
	}

}
