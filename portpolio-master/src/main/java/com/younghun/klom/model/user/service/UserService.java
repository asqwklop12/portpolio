package com.younghun.klom.model.user.service;

import java.io.UnsupportedEncodingException;

import javax.mail.MessagingException;

import com.younghun.klom.model.user.vo.UserVo;

public interface UserService{	

	// 회원가입
	void register (UserVo userVo) throws Exception;
	
	// 비밀번호 찾기
	void searchPassword(String email) throws MessagingException, UnsupportedEncodingException;
	
	// 로그인
	UserVo login (UserVo userVo);

	void yesAuth(String email, String key);
	
	// 인증확인
	UserVo authorization(String email);

	
	// 정보 수정
	void edit (UserVo userVo);	
	void edit2(UserVo userVo);
	
	// 유저 삭제
	void delete(UserVo userVo);

	
	boolean match(String row, String encode);
}
