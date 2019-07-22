package com.younghun.klom.structor;

import java.util.HashMap;
import java.util.Map;

public class PostMap {

	public Map<String, Object> map(int display, int post) {

		Map<String, Object> map = new HashMap<>();
		
		map.put("display", display);
		map.put("post", post);
		
		return map;
	}
	
}
