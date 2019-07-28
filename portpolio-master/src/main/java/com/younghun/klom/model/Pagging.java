package com.younghun.klom.model;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Pagging {

	private int total;
	private int count;

	// 전체 페이지
	public Pagging(int total, int count) {
		this.total = total;
		this.count = count;
	}

	// 화면에 보여질 최대 갯수
	public int getCount() {
		return count;
	}

	// 페이지 갯수
	public int pagging() {

		log.debug("게시물의 총 갯수: {}", total);

		int size = total / count;

		if (total % count > 0) {
			size++;
		}

		log.debug("지금 페이징되는 페이지 갯수 : {}", size);
		return size;
	}

	// 출력할 게시물
	public int display(int num) {
		return (num - 1) * count;
	}

}
