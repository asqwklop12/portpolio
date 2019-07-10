package com.younghun.klom.user.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.younghun.klom.user.dto.LoginDto;
import com.younghun.klom.user.vo.UserVo;

@Repository
public class UserDaoImpl implements UserDao{
	
	@Autowired
	private SqlSession sqlSession;
	
	private static final String NAMESPACE ="UserMapper.";
	
	@Override
	public void register(UserVo userVo) {

		sqlSession.insert(NAMESPACE + "Register",userVo);
		
	}
  
	@Override
	public UserVo login(String email, String password) {
		System.out.println(email + password); 
		return sqlSession.selectOne(NAMESPACE + "login",email); 
	}

}
