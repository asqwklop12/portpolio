package com.younghun.klom.user.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class LoginDto {
	private String email;
	private String password;
	private String name;
}
