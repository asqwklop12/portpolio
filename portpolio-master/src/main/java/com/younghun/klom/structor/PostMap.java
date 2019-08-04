package com.younghun.klom.structor;

import java.util.HashMap;
import java.util.Map;

public class PostMap {

	public Map<String, Object> map(int display, int post, String keyword) {

		Map<String, Object> map = new HashMap<>();
		map.put("keyword", keyword);
		map.put("display", display);
		map.put("post", post);
		
		return map;
	}
	
}
