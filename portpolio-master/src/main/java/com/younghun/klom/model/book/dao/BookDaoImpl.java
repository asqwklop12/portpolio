package com.younghun.klom.model.book.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.younghun.klom.model.book.vo.BookVo;
import com.younghun.klom.structor.PostMap;

@Repository
public class BookDaoImpl implements BookDao{

	Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private SqlSession sqlSession;
	
	private static final String NAMESPCE = "SearchMapper.";
	
	@Override
	public List<BookVo> search(int display, int post, String keyword) {
		Map<String, Object> listMap = new PostMap().map(display, post);
		listMap.put("keyword", keyword);
		List<BookVo> list = sqlSession.selectList(NAMESPCE + "list",listMap);
		logger.debug("{}",list);
		return list;
	}

}
