package com.younghun.klom.model.heart.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.younghun.klom.model.book.vo.BookVo;
import com.younghun.klom.model.heart.dao.HeartDao;
import com.younghun.klom.model.heart.vo.HeartVo;

@Service
public class HeartServiceImpl implements HeartService {

	@Autowired
	private HeartDao heartDao;

	@Override
	public int result(HeartVo heartVo) {
		
		return heartDao.result(heartVo);
	}

	@Override
	public int check(HeartVo heartVo) {
		return heartDao.check(heartVo);
	}

	@Override
	public void create(HeartVo heartVo) {
		heartDao.create(heartVo);
	}

	@Override
	public int change(HeartVo heartVo) {
		int resultCount = heartDao.heartResult(heartVo);
				
		BookVo bookVo = new BookVo();
		bookVo.setTitle(heartVo.getBookTitle());

		
		
		if (resultCount == 0) {
			heartDao.increse(heartVo);
			heartDao.heart_increse(bookVo);
		} else  {
			heartDao.decrese(heartVo);
			heartDao.heart_decrease(bookVo);
		}
		
		return resultCount;
	}

}
