package com.collection;

import java.util.ArrayList;
import java.util.List;

public class ListExample {


	public static void main(String args[]){  
	
	 List<String> list=new ArrayList<String>();   //Creating a List  
	
	 list.add("Mumbai");   //Adding elements in the List  
	 list.add("Pune");  
	 list.add("Nagpur");  
	 list.add("Goa");  
	
	 for(String city:list)   //Iterating the List element using for-each loop  
	  System.out.println(city);  
	  
	}  
	}  

