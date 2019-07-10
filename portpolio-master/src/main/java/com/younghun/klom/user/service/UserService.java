package com.younghun.klom.user.service;

import com.younghun.klom.user.dto.LoginDto;
import com.younghun.klom.user.vo.UserVo;

public interface UserService {
	
	void register (UserVo userVo);
	UserVo login(LoginDto loginDto) throws Exception;
}
