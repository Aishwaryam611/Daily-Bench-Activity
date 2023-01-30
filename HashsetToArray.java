package com.collection;

import java.util.HashSet;

public class HashsetToArray {

	public static void main(String[] args) {
	    HashSet < String > str = new HashSet();

	    str.add("Aish");
	    str.add("Krushna");
	    str.add("More");
	    
	    
	    System.out.println("The size of str set is: " + str.size()); //Know the size of set
	    
	    Object arr[] = str.toArray();

	    System.out.println("Array elements: ");
	    for (Object item: arr)
	      System.out.println(item + " ");
	  

	}
	
}
