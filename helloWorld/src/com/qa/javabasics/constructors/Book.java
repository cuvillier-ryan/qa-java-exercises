package com.qa.javabasics.constructors;

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
	
	public String getTitle() {
		return this.title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getAuthor() {
		return this.author;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public int getNumberOfPages() {
		return this.numberOfPages;
	}
	
	public void setNumberOfPages(int pages) {
		this.numberOfPages = pages;
	}

	
}
