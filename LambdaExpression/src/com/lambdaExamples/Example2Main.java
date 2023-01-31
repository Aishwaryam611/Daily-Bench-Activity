package com.lambdaExamples;

public class Example2Main {
	
	public static void main(String[] args) {
		Example2 i = s -> s.length();
		int len =i.findLength("Lambda");
		System.out.println("length of the given string is: "+len);
		

	}

}


