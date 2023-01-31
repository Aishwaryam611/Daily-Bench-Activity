package com.lambdaExamples;

public class Example3Main {

	public static void main(String[] args) {
		Example3 i = a -> {
			int x = a + 10;
			x = x/2;
			return x;
		};
		int op= i.doSomeCalculation(100);
		System.out.println(op);
		
		
	}

	
}
