package com.qa.javabasics;

public class StringManipulation {

	String str1 = "yesterday it was raining";
	String str2 = "today it is sunny";

	String mySubString1 = str2.substring(0, 11);
	String mySubString2 = str1.substring(16, 24);

	
	// Method 1 - When given a String, count and return how many words there are in
	// that String.
	public static int wordCount(String s) {

		if (s.length() == 0)
			return 0;
		int words = 1;
		for (int i = 0; i < s.length(); i++) {
			String current = s.substring(i, i + 1);
			if (current.equals(" ")) {
				words++;
			}
		}
		return words;

	}

	// Method 2 - When given a String, print out this String in a vertical fashion,
	// each word on a different line.
	// Method 3 - When given a String, print out this String in a vertical fashion
	// in reverse order, each word on a different line.
	// Method 4 - A find method, which takes 2 Strings; the first is message and the
	// second is the String you want to find in the message. A boolean value should
	// be returned to indicate whether or not the second String has been found in
	// the message.

}
