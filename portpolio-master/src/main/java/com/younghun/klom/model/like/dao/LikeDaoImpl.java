package com.younghun.klom.model.like.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.younghun.klom.model.like.vo.LikeVo;

@Repository
public class LikeDaoImpl implements LikeDao{

	@Autowired
	private SqlSession sqlSession;
	
	private final static String NAMESPACE = "LikeMapper.";
	
	
	@Override
	public void create(LikeVo likeVo) {
		sqlSession.insert(NAMESPACE + "board_Like",likeVo);
	}
	
	@Override
	public int duplicate(LikeVo likeVo) {
		return sqlSession.selectOne(NAMESPACE + "duplicate",likeVo);
	}
	
	
	
	@Override
	public int result(LikeVo likeVo) {
		return sqlSession.selectOne(NAMESPACE + "result", likeVo);
	}
	@Override
	public void increase(LikeVo likeVo) {
		sqlSession.update(NAMESPACE + "increase", likeVo);
	}
	@Override
	public void decrease(LikeVo likeVo) {
		sqlSession.update(NAMESPACE + "default", likeVo);
	}
	@Override
	public int board_result(int no) {
		return sqlSession.selectOne(NAMESPACE + "board", no);
	}
	@Override
	public void heart(int no) {
		sqlSession.update(NAMESPACE + "board_heart",no);
	}
	@Override
	public void breakHeart(int no) {
		sqlSession.update(NAMESPACE + "board_break",no);
	}

	


	
	

}
