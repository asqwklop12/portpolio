package com.younghun.klom.model.book.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.younghun.klom.model.book.vo.BookVo;
import com.younghun.klom.model.page.vo.SearchVo;

import lombok.extern.slf4j.Slf4j;

@Repository
@Slf4j
public class BookDaoImpl implements BookDao{

	
	@Autowired
	private SqlSession sqlSession;
	
	private static final String NAMESPCE = "BookMapper.";
	
	@Override
	public List<BookVo> search(SearchVo searchVo) {
		List<BookVo> list = sqlSession.selectList(NAMESPCE + "list",searchVo);
		log.debug("{}",list);
		return list;
	}

	@Override
	public BookVo result(String title) {
		return sqlSession.selectOne(NAMESPCE + "result",title);
	}

	@Override
	public List<BookVo> rank() {
		return sqlSession.selectList(NAMESPCE + "rank");
	}

	@Override
	public void insertBasic(BookVo bookVo) throws Exception {
		sqlSession.insert(NAMESPCE + "basic",bookVo);
	}

	@Override
	public void insertDetail(BookVo bookVo) throws Exception {
		sqlSession.insert(NAMESPCE + "detail",bookVo);
	}

}
