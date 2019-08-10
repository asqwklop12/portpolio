package com.younghun.klom.model.page.service;

import com.younghun.klom.model.search.dto.SearchDto;

public interface PaggingService {

	// board
	int board();

	// searchList
	int search(String email);

	// book
	int book(String keyword);

}
