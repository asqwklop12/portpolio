package com.younghun.klom.model.board.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.younghun.klom.model.board.dto.DetailDto;
import com.younghun.klom.model.board.vo.BoardVo;

@Repository 
public class BoardDaoImpl implements BoardDao {

	@Autowired
	private SqlSession session;
	
	private static final String NAMESPACE = "BoardMapper.";
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	@Override
	public List<BoardVo> boardList() {
		List<BoardVo> list = session.selectList(NAMESPACE + "list");
		logger.debug("{}이 반환되었습니다.", list);
		return list;
	}
	@Override
	public DetailDto find(long no) {
		DetailDto detailDto = session.selectOne(NAMESPACE + "detail",no);
//		System.out.println(detailDto);
		logger.debug("{} 반환되었습니다2.",detailDto);
		return detailDto;
	}

}
