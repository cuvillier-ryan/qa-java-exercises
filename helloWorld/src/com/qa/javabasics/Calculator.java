package com.qa.javabasics;

public class Calculator {

	public static int add(int x, int y) {
		return x + y;
	}

	public static int multiply(int x, int y) {
		return x * y;
	}

	public static int subtract(int x, int y) {
		return x - y;
	}

	public static double divide(double x, double y) {
		if (x < y) {
			return y / x;
		} else {
			return 0;
		}
	}

	public static double doubleDivide(double x, double y) {
		return x / y;
	}

}
