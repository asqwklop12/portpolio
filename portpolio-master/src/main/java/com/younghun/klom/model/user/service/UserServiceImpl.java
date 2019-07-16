package com.younghun.klom.model.user.service;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.younghun.klom.model.Encryption;
import com.younghun.klom.model.user.dao.UserDao;
import com.younghun.klom.model.user.dto.EditDto;
import com.younghun.klom.model.user.dto.LoginDto;
import com.younghun.klom.model.user.vo.UserVo;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;

	@Autowired
	public Encryption encryption;
		
	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Override
	public void register(UserVo userVo) {
		logger.info("start");
		
		userVo.setPassword(encryption.encrypt(userVo.getPassword()));
		userDao.register(userVo);

		logger.debug("{}", encryption.encrypt(userVo.getPassword()));
		
	}

	@Override
	public Map<String, String> login(LoginDto loginDto) {

		Map<String, String> data = userDao.login(loginDto);

		logger.debug("{} and {}", loginDto.getPassword(),data.get("password"));

		if (encryption.matches(loginDto.getPassword(), data.get("password"))) {
			
			return data;
		}
		
		return data;
	}

	

}
  