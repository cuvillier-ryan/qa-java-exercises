package com.qa.javabasics;

import java.util.ArrayList;

public class Main {

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
			
		
		Person ryan = new Person("Ryan", 34, "male");
		Book raven = new Book("The Raven", "Edgar Allen Poe", 30);
		
		System.out.println(ryan.isReading() + raven.getBookTItle());
		
	}

}
