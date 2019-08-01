package com.younghun.klom.model.like.service;

import com.younghun.klom.model.like.vo.LikeVo;

public interface LikeService {

	
	// 좋아요만들기
	void create(LikeVo likeVo);
	
	// 중복 확인
	boolean duplicate(LikeVo likeVo);
	
	// 게시글 좋아요
	int result(LikeVo likeVo);
	void increase(LikeVo likeVo);
	void decrease(LikeVo likeVo);
	
	// 전체 유저 좋아요 표시
    int board_result(int no);
}
