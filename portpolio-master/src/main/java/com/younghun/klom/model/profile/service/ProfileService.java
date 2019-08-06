package com.younghun.klom.model.profile.service;

public interface ProfileService {
	
	// 프로필 이미지 가져오기
	String getProfile(int id);
	
	// 전체 갯수
	int count();
}
