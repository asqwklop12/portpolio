package com.younghun.klom.model.crawling;

import java.io.IOException;
import java.util.List;

import org.junit.Test;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CrawingTest {

	@Test
	public void test() throws IOException {
		
		Crawing crawing = new Crawing("bandi");
//		crawing.getCrawing("bandi");
		List<String> listA = crawing.start(5);
//		
		for (String s : listA) {
			log.debug("{}",s);	
		}
		
//		crawing.getCrawing("yes24");
		crawing = new Crawing("yes24");
		List<String> listB = crawing.start(5);
		
		for (String s : listB) {
			log.debug("{}",s);
		}
	}

}
