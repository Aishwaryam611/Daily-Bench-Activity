package com.exceptionsExample;

public class Unchecked_demo {

	public static void main(String args[]) {
	      int num[] = {1, 2, 3, 4};
	      System.out.println(num[6]);
	   }
	}	

 	
	
//output : Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 4
//at com.exceptionsExample.Unchecked_demo.main(Unchecked_demo.java:7)


// unchecked : These are not exceptions at all, but problems that arise beyond the control of the user or the programmer.
