package com.collection;

import java.util.HashSet;

public class Hashset_IsEmptyMethod {
	 public static void main(String[] args) {
		    HashSet < Integer > nums = new HashSet();
		    HashSet < String> str1 = new HashSet();
		    HashSet < String> str2 = new HashSet();
		    
		    nums.add(1);
		    nums.add(2);
		    nums.add(3);
		    nums.add(4);
		    
		    str2.add("Pune");

		    if (nums.isEmpty())
		      System.out.println("The HashSet nums is an empty.");
		    else
		      System.out.println("The HashSet nums is not an empty");

		    if (str1.isEmpty())
		      System.out.println("The HashSet str1 is an empty.");
		    else
		      System.out.println("The HashSet str1 is not an empty.");
		    
		    

		    if (str2.isEmpty())
		      System.out.println("The HashSet str2 is an empty.");
		    else
		      System.out.println("The HashSet str2 is not an empty.");
}
}
