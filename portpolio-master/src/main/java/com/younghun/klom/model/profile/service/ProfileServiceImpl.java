package com.younghun.klom.model.profile.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.younghun.klom.model.profile.dao.ProfileDao;

@Service
public class ProfileServiceImpl implements ProfileService{

	
	@Autowired
	private ProfileDao profileDao;
	
	@Override
	public String getProfile(int id) {
		return profileDao.getProfile(id);
	}

	@Override
	public int count() {
		return profileDao.count();
	}

}
