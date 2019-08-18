package com.younghun.klom.model.delete.service;

public interface DeleteService {

	void comment(String email);

	void notice(String email);

	void heart(String email);
		
	void board(String email);

	void search(String email);

}
