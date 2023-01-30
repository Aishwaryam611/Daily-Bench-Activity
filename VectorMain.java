package com.collection;

import java.util.Iterator;
import java.util.Vector;

public class VectorMain {
	 public static void main(String[] args) {
	        Vector<String> mammals= new Vector<>();

	        // Using the add() method
	        mammals.add("Dog");
	        mammals.add("Horse");

	        // Using index number
	        mammals.add(1, "Cat");
	        System.out.println("Vector: " + mammals);

	        // Using addAll()
	        Vector<String> animals = new Vector<>();
	        animals.add("Crocodile");

	        animals.addAll(mammals);
	        System.out.println("New Vector: " + animals);
	        
	     // Using get()........get(index) - returns an element specified by the index
	        String element = animals.get(2);
	        System.out.println("Element at index 2: " + element);

	  // iterator() - returns an iterator object to sequentially access vector elements
	        Iterator<String> iterate = animals.iterator();
	        System.out.print("Vector: ");
	        while(iterate.hasNext()) {
	            System.out.print(iterate.next());
	            System.out.print(", ");
	        
	        
	    }
	}
}


