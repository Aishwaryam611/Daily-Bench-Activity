package com.collection;

import java.util.Stack;

public class StackSearchMethod {

	 
		public static void main(String[] args)   
		{  
		Stack<String> stk= new Stack<>();  
		
		
		//pushing elements into Stack  
		stk.push("Mac");  
		stk.push("HP");  
		stk.push("DELL");  
		stk.push("Asus");  
		System.out.println("Stack: " + stk);  
		
		// Search an element  
		int location = stk.search("HP");  
		System.out.println("Location of Dell: " + location);  
		
		// Checks the Stack is empty or not  
		boolean rslt=stk.empty();  
		System.out.println("Is the stack empty: " +rslt);  
		
		
		// Find the size of the Stack  
		int x=stk.size();  
		System.out.println("The stack size is: "+x);  
		
		}
}
		
		
		
		
		
	
	
	

