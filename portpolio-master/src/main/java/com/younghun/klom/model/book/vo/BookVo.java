package com.younghun.klom.model.book.vo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BookVo {

	private int id;								//BookId(P)
	private String image;						//BookPicture
	private String title;						//BookTitle
	private String author;						//BookAuthor
	private String publisher;					//BookPublisher
	private int page;							//BookPage
	private String price;							//BookPrice
	private long ISBN;						//BookISBN
	private String date;						//BookDate
	
	private String summary;						//BookSummary
	private String bookIndex;				    //BookIndex
	
	private int heart;						    //BookLike
}
