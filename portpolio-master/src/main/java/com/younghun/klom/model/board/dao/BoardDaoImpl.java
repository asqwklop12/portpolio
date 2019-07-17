package com.younghun.klom.model.board.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.younghun.klom.model.board.vo.BoardVo;
import com.younghun.klom.model.user.vo.UserVo;

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
	public BoardVo find(long no) {
		BoardVo detailDto = session.selectOne(NAMESPACE + "detail",no);
//		System.out.println(detailDto);
		logger.debug("{} 반환되었습니다2.",detailDto);
		return detailDto;
	}

	
	
	// 게시글 작성
	@Override
	public void create(BoardVo boardVo) {
		
		session.insert(NAMESPACE + "write",boardVo);
		logger.debug("{}endtddsdd",boardVo);
	}


}
