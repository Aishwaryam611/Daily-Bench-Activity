package com.collection;

import java.util.ArrayList;

public class RemoveArrayListElement {

		  public static void main(String[] args) {
		    ArrayList<String> alphabets = new ArrayList<>();

		    // add elements in the array list
		    alphabets.add("aaa");
		    alphabets.add("bbb");
		    alphabets.add("ccc");
		    System.out.println("ArrayList: " + alphabets);

		    // remove element from index 2
		    String str = alphabets.remove(2);
		    System.out.println("ArrayList after removing element " + alphabets);
		    System.out.println("Removed Element: " + str);
		  }
		}

