package com.collection;

import java.util.ArrayList;
import java.util.List;

public class GetAndSetElementInList {
	
	public static void main(String args[]){  
		 
		 List<String> list=new ArrayList<String>();   //Creating a List  
		 
		 list.add("Pune");   //Adding elements in the List  
		 list.add("Mumbai");  
		 list.add("Nagpur");  
		
		 
		 //accessing the element    
		 System.out.println("Returning element: "+list.get(1)); //it will return the 2nd element, because index starts from 0  
		 
		 
		 //changing the element  
		 list.set(1,"Goa");  
		 
		 //Iterating the List element using for-each loop  
		 for(String city:list)  
		  System.out.println(city);  
		  
		 }  
		}  

