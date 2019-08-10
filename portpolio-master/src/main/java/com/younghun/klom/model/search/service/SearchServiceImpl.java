package com.younghun.klom.model.search.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.younghun.klom.model.search.dao.SearchDao;
import com.younghun.klom.model.search.vo.SearchListVo;

@Service
public class SearchServiceImpl implements SearchService {

	@Autowired
	private SearchDao searchDao;

	@Override
	public void delete(SearchListVo searchVo) {
		// 지우고
		searchDao.delete(searchVo);
		String email = searchVo.getUserEmail();

		// 전체 감소
		for (int i = searchVo.getSearchId(); i <= searchDao.max(); i++) {
			searchDao.updateId(i);
		}

		// 그룹별 감소
		for (int i = searchVo.getSearchNumber(); i <= searchDao.user(email); i++) {
			SearchListVo vo = new SearchListVo();
			vo.setSearchNumber(i);
			vo.setUserEmail(email);
			searchDao.updateGroup(vo);
		}

	}

}
