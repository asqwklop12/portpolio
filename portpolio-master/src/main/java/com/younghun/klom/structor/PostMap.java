package com.younghun.klom.structor;

import java.util.HashMap;
import java.util.Map;

public class PostMap {

	public Map<String, Integer> map(int display, int post) {

		Map<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("display", display);
		map.put("post", post);
		
		return map;
	}
	
}
