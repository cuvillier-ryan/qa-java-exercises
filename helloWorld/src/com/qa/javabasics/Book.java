package com.qa.javabasics;

public class Book {
	
	public String title;
	public String author;
	public int numberOfPages;
	
	
	//Constructor
	public Book(String title, String author, int numberOfPages) {
		this.title = title;
		this.author = author;
		this.numberOfPages = numberOfPages;
	}
	
	public String getBookTItle() {
		return this.title;
	}

	
}
