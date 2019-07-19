package com.younghun.klom.model.board.structor;

import java.util.HashMap;
import java.util.Map;

public class PostMap {

	public Map<String, Integer> boardList(int display, int post) {

		Map<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("display", display);
		map.put("post", post);
		
		return map;
	}
	
}
