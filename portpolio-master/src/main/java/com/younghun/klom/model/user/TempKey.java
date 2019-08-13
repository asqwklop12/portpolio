package com.younghun.klom.model.user;

import java.util.Random;

public class TempKey {
	private int size;
	private boolean lowerCheck;
	
	public String getKey(int size, boolean lowerCheck) {
		this.size = size;
		this.lowerCheck = lowerCheck;
		return init();
	}
	
	private String init() {
		Random ran = new Random();
		StringBuffer sb = new StringBuffer();

		do {
			int num = ran.nextInt(75) + '0';
			if ((num >= 48 && num <= 57) || (num >= 65 && num <= 90) || (num >= 97 && num <= 122)) {
				sb.append((char) num);
			} else {
				continue;
			}

		} while (sb.length() < size);
		 if(lowerCheck) {
			 return sb.toString().toLowerCase();
		 }
		 
		return sb.toString();

	}
}
