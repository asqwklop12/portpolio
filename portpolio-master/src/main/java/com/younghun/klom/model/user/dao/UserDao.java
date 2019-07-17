package com.younghun.klom.model.user.dao;

import java.util.Map;

import com.younghun.klom.model.user.vo.UserVo;

public interface UserDao {
	
	// 회원가입
	void register (UserVo userVo);
	
	// 로그인
	Map<String,String> login (UserVo userVo);
	
	// 정보 수정
	void edit (UserVo userVo);
	
	
	// 유저 삭제
	void delete(UserVo userVo);

	
 }
