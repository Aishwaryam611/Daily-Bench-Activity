package com.lambdaExamples;

public class ExampleMain {

	public static void main(String[] args) {
		Example i = () -> System.out
				.println("Function without any argument and return type.....Implemented using lambda");
		i.funMethod();
	}

}
