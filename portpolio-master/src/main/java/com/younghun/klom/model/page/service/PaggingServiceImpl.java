package com.younghun.klom.model.page.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.younghun.klom.model.page.dao.PaggingDao;

@Service
public class PaggingServiceImpl implements PaggingService {

	
	@Autowired
	private PaggingDao countDao;
	
	@Override
	public int board() {
		return countDao.board();
	}

	@Override
	public int book(String keyword) {
		return countDao.book(keyword);
	}

}
