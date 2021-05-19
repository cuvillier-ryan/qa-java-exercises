package com.qa.javabasics.constructors;

public class Person {
	public String name;
	public int age;
	public String gender;

	// Constructor
	public Person(String name, int age, String gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	public String isReading(Book book) {
		return this.name + " is reading: " + book.title;
	}
	
	
	
}
