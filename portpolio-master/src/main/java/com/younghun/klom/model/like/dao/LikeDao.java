package com.younghun.klom.model.like.dao;

import com.younghun.klom.model.like.vo.LikeVo;

public interface LikeDao {

	// 좋아요만들기
	void create(LikeVo likeVo);
	
	// 중복확인
	int duplicate(LikeVo likeVo);
	
	
	// 좋아요 증감
	int result(LikeVo likeVo);
	void increase(LikeVo likeVo);
	void decrease(LikeVo likeVo);
	
	
	// 게시글 표시
	int board_result(int no);
	void heart(int no);
	void breakHeart(int no);
}
