package com.qa.javabasics;

import com.qa.javabasics.constructors.Book;
import com.qa.javabasics.constructors.Person;

public class Main {
	
	static Person person1 = new Person("Ryan", 34, "male");
	static Book book1 = new Book("The Raven", "Edgar Allen Poe", 30);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//			Results.getPercentage();
//			
//			ArrayList<Integer> numbers = new ArrayList<Integer>();
//			numbers.add(20);
//			numbers.add(10);
//			numbers.add(34);
//			numbers.add(18);
//			numbers.add(22);
//			numbers.add(3);
//			numbers.add(46);
//			
//			System.out.println(numbers);
//			
//			for(int i = 0; i < numbers.size(); i++) {
//				System.out.println(numbers.get(i));
//			
//			}
//			
//			for(Integer handler : numbers) {
//				System.out.println(handler);
//			}
			
		
		
		System.out.println(person1.isReading() + book1.title);
		
	}

}
