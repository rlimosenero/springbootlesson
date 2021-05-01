package com.example.springbootcourse.model;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class Books {
	
	private List<Book> book;
	
	public Books() {}

	public List<Book> getBook() {
		return book;
	}

	public void setBook(List<Book> book) {
		this.book = book;
	}
	


}
