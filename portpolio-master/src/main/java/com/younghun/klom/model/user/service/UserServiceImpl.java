package com.younghun.klom.model.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.younghun.klom.model.user.dao.UserDao;
import com.younghun.klom.model.user.vo.UserVo;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;

	@Autowired
	public PasswordEncoder passwordEncoder;

	@Override
	public void register(UserVo userVo) {
		log.info("start");

		userVo.setPassword(passwordEncoder.encode(userVo.getPassword()));
		userDao.register(userVo);

		log.debug("{}", passwordEncoder.encode(userVo.getPassword()));

	}

	@Override
	public UserVo login(UserVo userVo) {
		return userDao.login(userVo);
	}

	@Override
	public void edit(UserVo userVo) {
		log.debug("{} enter..into", userVo);
		userDao.edit(userVo);

	}
	
	@Override
	public void edit2(UserVo userVo) {
		userVo.setPassword(passwordEncoder.encode(userVo.getPassword()));
		userDao.edit2(userVo);
	}

	@Override
	public void delete(UserVo userVo) {
		userDao.delete(userVo);

	}

	    
	
	@Override
	public boolean match(String row, String encode) {
		return passwordEncoder.matches(row, encode);
	}

	



}
