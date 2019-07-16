package com.younghun.klom.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public class Encryption {

	@Autowired
	public PasswordEncoder passwordEncoder;
	
	
	public String encrypt(String value) {
		return passwordEncoder.encode(value);	
	}
	
	
	public boolean matches(String row, String encode) {
		return passwordEncoder.matches(row, encode);
	}
}
