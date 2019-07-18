package com.younghun.klom.model.board.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.younghun.klom.model.board.dao.PaggingDao;

@Service
public class PaggingServiceImpl implements PaggingService {

	
	@Autowired
	private PaggingDao countDao;
	
	@Override
	public int board() {
		return countDao.board();
	}

}
