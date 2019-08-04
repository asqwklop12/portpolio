package com.younghun.klom.model.book.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.younghun.klom.model.book.vo.BookVo;
import com.younghun.klom.structor.PostMap;

import lombok.extern.slf4j.Slf4j;

@Repository
@Slf4j
public class BookDaoImpl implements BookDao{

	
	@Autowired
	private SqlSession sqlSession;
	
	private static final String NAMESPCE = "SearchMapper.";
	
	@Override
	public List<BookVo> search(int display, int post, String keyword) {
		Map<String, Object> listMap = new PostMap().map(display, post,keyword);
		
		List<BookVo> list = sqlSession.selectList(NAMESPCE + "list",listMap);
		log.debug("{}",list);
		return list;
	}

	@Override
	public BookVo result(String title) {
		return sqlSession.selectOne(NAMESPCE + "result",title);
	}

}
