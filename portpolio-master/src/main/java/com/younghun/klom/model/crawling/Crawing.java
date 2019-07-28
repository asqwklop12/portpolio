package com.younghun.klom.model.crawling;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Crawing {

	private String url;
	private Elements elements;
	private String bookStore;
	private int c = 0;
	
	public Crawing(String bookStore) throws IOException {
		this.bookStore = bookStore;
		this.url = new Url().addressMap().get(bookStore);
		Document doc = Jsoup.connect(url).post();
		this.elements = doc.select(new Selecter().selectMap().get(bookStore));
	}
	
	
	
	
	
	public List<String> start(int count) {
	  
		List<String> bookList = new ArrayList<>();
		for (Element element : elements) {
			
			if (isBookStore(element) && c < count) {
				String img = element.attr("src");
				bookList.add(img);
				c++;
			 }
			
		}
		return bookList;
	}
	
	
	private boolean isBookStore(Element e) {
		
		if (bookStore == "ypbook") {
			return e.attr("class").contains("thumb");
		}
		
		if (bookStore == "yes24") {
			return !e.attr("alt").contains("미리보기");
		}
		
		return true;
	}

}
 