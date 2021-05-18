package com.qa.starterworld;

public class Results {
	
	public static double Physics = 110;
	public static double Chemistry = 120;
	public static double Biology = 100;
	public static double total;
	public static double percentage;
	
	public static void showResult() {
		System.out.println("\nChemistry grade: " + Chemistry);
		System.out.println("Physics grade: " + Physics);
		System.out.println("Biology grade " + Biology);
		
		total = Chemistry + Physics + Biology;
		System.out.println("\nYour total score is " + total);
		
	}
	
	public static void percentageResults() {
		total = Chemistry + Biology + Physics;
		percentage = (total * 100) / 450;
		System.out.println("Total percentage is: " + percentage);
	}
	
		
	
	

}
