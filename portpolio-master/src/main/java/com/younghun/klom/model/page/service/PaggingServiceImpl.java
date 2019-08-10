package com.younghun.klom.model.page.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.younghun.klom.model.page.dao.PaggingDao;
import com.younghun.klom.model.page.vo.SearchVo;
import com.younghun.klom.model.search.dto.SearchDto;

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
		SearchVo searchVo = new SearchVo();
		searchVo.setKeyword(keyword);
		return countDao.book(searchVo);
	}

	@Override
	public int search(String email) {
		SearchDto searchDto = new SearchDto();
		searchDto.setUserEmail(email);
		return countDao.search(searchDto);
	}

	

}
