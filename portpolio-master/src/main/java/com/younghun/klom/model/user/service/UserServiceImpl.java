package com.younghun.klom.model.user.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.younghun.klom.model.user.dao.UserDao;
import com.younghun.klom.model.user.dto.LoginDto;
import com.younghun.klom.model.user.vo.UserVo;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;
	
	@Override
	public void register(UserVo userVo) {

		userDao.register(userVo);
	}

	@Override
	public Map<String,String> login(LoginDto loginDto) {
		return userDao.login(loginDto);
	}

}
