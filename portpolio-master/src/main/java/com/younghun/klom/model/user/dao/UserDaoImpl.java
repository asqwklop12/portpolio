package com.younghun.klom.model.user.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.younghun.klom.model.user.vo.AuthorizationVo;
import com.younghun.klom.model.user.vo.UserVo;

import lombok.extern.slf4j.Slf4j;

@Repository
@Slf4j
public class UserDaoImpl implements UserDao{

	@Autowired
	private SqlSession session;
	
	private static final String NAMESPACE ="UserMapper.";
	
	// 회원 가입
	@Override
	public void register(UserVo userVo) {
		session.insert(NAMESPACE + "Register",userVo);
	}
  
	// 로그인
	@Override
	public UserVo login(UserVo userVo) {
		return session.selectOne(NAMESPACE + "login",userVo); 
	}

	// 정보 수정
	@Override
	public void edit(UserVo userVo) {
		log.debug("{} dao",  userVo);
		session.update(NAMESPACE + "modify", userVo);
	}

	@Override
	public void edit2(UserVo userVo) {
		session.update(NAMESPACE + "change",userVo);
	}
	
	// 계정 삭제
	@Override
	public void delete(UserVo userVo) {
		session.delete(NAMESPACE + "clear", userVo);
		
	}

	@Override
	public void getKey(AuthorizationVo vo) {
		session.update(NAMESPACE + "authorization",vo);
		
	}

	@Override
	public void yesAuth(AuthorizationVo vo) {
		session.update(NAMESPACE + "yes",vo);
	}

	@Override
	public UserVo authorization(UserVo userVo) {
		return session.selectOne(NAMESPACE + "confirmLogin", userVo);
	}

	

	

	


}