package com.younghun.klom.model.user.service;

import com.younghun.klom.model.user.dao.UserDao;

public interface UserService extends UserDao{	

	boolean match(String row, String encode);
}
