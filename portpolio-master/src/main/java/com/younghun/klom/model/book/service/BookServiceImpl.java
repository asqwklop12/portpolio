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
public class BookServiceImpl implements BookService {

	@Autowired
	private BookDao bookDao;

	@Override
	public List<BookVo> search(int display, int post, String keyword) throws Exception {
		SearchVo searchVo = new SearchVo();
		searchVo.setDisplay(display);
		searchVo.setPost(post);
		searchVo.setKeyword(keyword);
		List<BookVo> list = bookDao.search(searchVo);
		log.debug("{}", list);
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

	@Override
	public void insertBasic(String image, String title, String author, String publisher, long isbn, int page,
			String date, String price) throws Exception {

		BookVo bookVo = new BookVo();
		bookVo.setImage(image);
		bookVo.setTitle(title);
		bookVo.setAuthor(author);
		bookVo.setPublisher(publisher);
		bookVo.setISBN(isbn);
		bookVo.setPage(page);
		bookVo.setDate(date);
		bookVo.setPrice(price);
		bookDao.insertBasic(bookVo);
	}

	@Override
	public void insertDetail(String title, String introduce, String index) throws Exception {
		
		BookVo bookVo = new BookVo();
		bookVo.setTitle(title);
		bookVo.setSummary(introduce);
		bookVo.setBookIndex(index);
		bookDao.insertDetail(bookVo);
	}

}
