package com.younghun.klom.model.book.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.younghun.klom.model.book.dao.BookDao;
import com.younghun.klom.model.book.vo.BookVo;


@Service
public class BookServiceImpl implements BookService{

	@Autowired
	private BookDao bookDao;
	
	Logger logger = LoggerFactory.getLogger(this.getClass());
	@Override
	public List<BookVo> search() {
		List<BookVo> list = bookDao.search();
		logger.debug("{}",list);
		return bookDao.search();
	}

}
