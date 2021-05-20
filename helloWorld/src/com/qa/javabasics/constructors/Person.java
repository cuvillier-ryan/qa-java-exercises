package com.qa.javabasics.constructors;

public class Person {
	private String name;
	private int age;
	private String gender;

	// Constructor
	public Person(String name, int age, String gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	public void isReading(Book book) {
		System.out.println(this.name + " is reading: " + book.getTitle());
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getGender() {
		return this.gender;
	}
	
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	
	
	
	
}
