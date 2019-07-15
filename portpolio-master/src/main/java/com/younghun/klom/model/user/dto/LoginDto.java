package com.younghun.klom.model.user.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
//UserInfo
public class LoginDto {
	private String email;		//UserEmail
	private String password;	//UserPassword
}
