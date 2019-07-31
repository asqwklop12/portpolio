package com.younghun.klom.model.board.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.younghun.klom.model.board.vo.BoardVo;
import com.younghun.klom.structor.PostMap;

import lombok.extern.slf4j.Slf4j;

@Repository 
@Slf4j
public class BoardDaoImpl implements BoardDao {

	@Autowired
	private SqlSession session;
	
	private static final String NAMESPACE = "BoardMapper.";
	
	@Override
	public List<BoardVo> list(int display, int post) {
		
		// 매개변수 맵에 삽입
		Map<String, Object> listMap = new PostMap().map(display, post);
		List<BoardVo> list = session.selectList(NAMESPACE + "list",listMap);
		log.debug("{}이 반환되었습니다.", list);
		return list;
	}
	@Override
	public BoardVo find(long no) {
		BoardVo detailDto = session.selectOne(NAMESPACE + "detail",no);
//		System.out.println(detailDto);
		log.debug("{} 반환되었습니다2.",detailDto);
		return detailDto;
	}

	
	
	// 게시글 작성
	@Override
	public void create(BoardVo boardVo) {
		
		session.insert(NAMESPACE + "write",boardVo);
		log.debug("{}endtddsdd",boardVo);
	}
	@Override
	public void update(BoardVo boardVo) {
		session.update(NAMESPACE + "modify",boardVo);
	}
	@Override
	public void clear(long no) {
		session.delete(NAMESPACE + "clear", no);
	}
	
	
	@Override
	public void updateView(int no) {
		session.update(NAMESPACE + "view",no);
	}
	


	
}
