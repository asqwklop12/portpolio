package com.younghun.klom.user.dao;

import com.younghun.klom.user.dto.LoginDto;
import com.younghun.klom.user.vo.UserVo;

public interface UserDao {
	void register (UserVo userVo);
	UserVo login (String email, String password);
 }
