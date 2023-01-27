package com.collection;

import java.util.ArrayList;
import java.util.List;

public class BookMain {
	public static void main(String[] args) {  
		
	   
	    List<ListBook> list=new ArrayList<ListBook>();    //Creating list of Books  
	    
	    
	    ListBook b1=new ListBook(101,"C","XYZ","MC Graw Hill",100);  
	    ListBook b2=new ListBook(102,"html","PQR","Mc Graw Hill",50);  
	    ListBook b3=new ListBook(103,"java","MNO","Wiley",58);  
	    
	 
	    list.add(b1);   //Adding Books to list  
	    list.add(b2);  
	    list.add(b3);  
	    
	    //Traversing list  
	    for(ListBook b:list){  
	    System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);  
	    }  
	}  
	}  

