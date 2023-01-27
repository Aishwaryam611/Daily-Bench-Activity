package com.collection;

import java.util.Iterator;
import java.util.LinkedList;

public class ReverseElementsOfLinkedList {
	
	 public static void main(String args[]){  
		  
		  LinkedList<String> ll=new LinkedList<String>();  
		           ll.add("Aish");  
		           ll.add("More");  
		           ll.add("Nisha");  
		           //Traversing the list of elements in reverse order  
		           Iterator i=ll.descendingIterator();  
		           while(i.hasNext())  
		           {  
		               System.out.println(i.next());  
		           }  
		             
		 }  
		}  
	
	

