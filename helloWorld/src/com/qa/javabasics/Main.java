package com.qa.javabasics;

import com.qa.javabasics.constructors.Book;
import com.qa.javabasics.constructors.Person;

public class Main {
	
	static Person person1 = new Person("Ryan", 34, "male");
	static Book book1 = new Book("The Raven", "Edgar Allen Poe", 30);

	public static void main(String[] args) {
		
		
		System.out.println(person1.isReading(book1)); 
		
	}

}
