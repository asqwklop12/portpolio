package com.younghun.klom.model.user.dao;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.younghun.klom.model.user.vo.UserVo;

@Repository
public class UserDaoImpl implements UserDao{
	private final Logger logger = LoggerFactory.getLogger(this.getClass());

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
		logger.debug("{} dao",  userVo);
		session.update(NAMESPACE + "modify", userVo);
	}

	// 계정 삭제
	@Override
	public void delete(UserVo userVo) {
		session.delete(NAMESPACE + "clear", userVo);
		
	}

	


}