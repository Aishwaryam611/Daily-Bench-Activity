package com.stringExamples;

public class StringBuffer_insertMethod {

	public static void main(String args[]){  
		
		StringBuffer sb=new StringBuffer("Hello ");  
		
		sb.insert(1,"How are you");//now original string is changed  
		
		System.out.println(sb); 
		}  	
	
	
	
}
