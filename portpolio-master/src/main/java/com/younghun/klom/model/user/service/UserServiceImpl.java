package com.younghun.klom.model.user.service;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.younghun.klom.model.user.dao.UserDao;
import com.younghun.klom.model.user.dto.LoginDto;
import com.younghun.klom.model.user.vo.UserVo;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;

	@Autowired
	public PasswordEncoder passwordEncoder;

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Override
	public void register(UserVo userVo) {
		logger.info("서비스레지스");
		String encPassword = passwordEncoder.encode(userVo.getPassword());
		userVo.setPassword(encPassword);
		userDao.register(userVo);

		logger.debug("{}", encPassword);
		logger.info("찍힘...");
	}

	@Override
	public Map<String, String> login(LoginDto loginDto) {

		Map<String, String> login = userDao.login(loginDto);

		if (passwordEncoder.matches(loginDto.getPassword(), login.get("password"))) {
			login = userDao.login(loginDto);
		}
		return login;
	}

}
