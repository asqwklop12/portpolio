package com.younghun.klom.model.user.dto;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class EditDto {
	private Long id;					//UserId(P)
	private String image;				//UserImage
	private String email;				//UserEmail
	private String name;				//UserName
	private String password;			//UserPassword
	private Date oldDate;				//UserDate
	private Date newDate;				//UserDate
}
