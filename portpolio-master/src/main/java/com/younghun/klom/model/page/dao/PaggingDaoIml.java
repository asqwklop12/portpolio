package com.younghun.klom.model.page.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.younghun.klom.model.page.vo.SearchVo;
import com.younghun.klom.model.search.dto.SearchDto;

@Repository
public class PaggingDaoIml implements PaggingDao {

	@Autowired
	private SqlSession sqlSession;
	
	private static final String NAMESPACE = "PaggingMapper.";
	
	
	@Override
	public int board() {
		return sqlSession.selectOne(NAMESPACE + "board");
	}


	@Override
	public int book(SearchVo searchVo) {
		return sqlSession.selectOne(NAMESPACE + "book", searchVo);
	}


	@Override
	public int search(SearchDto searchDto) {
		return sqlSession.selectOne(NAMESPACE + "search",searchDto);
	}

}
