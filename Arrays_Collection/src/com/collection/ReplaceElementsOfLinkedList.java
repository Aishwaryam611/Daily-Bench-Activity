package com.collection;

import java.util.LinkedList;

public class ReplaceElementsOfLinkedList {

	
	    public static void main(String[] args)
	    {
	        LinkedList<String> list = new LinkedList<String>();
	 
	      
	 
	        list.add("Pune");
	 
	        list.add("Mumbai");
	 
	        list.add("Nagpur");
	 
	       
	 
	        //Printing the elements of list
	 
	        System.out.println(list);     
	 
	        //Replacing an element at index 2 with "ZERO"
	 
	        list.set(2, "ZERO");
	 
	        System.out.println(list);    
	    }
	}
	

