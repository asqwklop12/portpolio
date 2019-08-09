package com.younghun.klom.model.user.dao;

import com.younghun.klom.model.user.vo.UserVo;

public interface UserDao {
	
	// 회원가입
	void register (UserVo userVo);
	
	// 로그인
	UserVo login (UserVo userVo);
	
	// 정보 수정
	void edit (UserVo userVo);	
	void edit2(UserVo userVo);
	
	// 유저 삭제
	void delete(UserVo userVo);

	
 }
