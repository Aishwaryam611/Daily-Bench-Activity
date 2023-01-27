package com.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToList {

	public static void main(String args[]){  
		
		String[] array={"Mumbai","Pune","Nagpur"};  	// Array 
		System.out.println("Array: "+Arrays.toString(array));  
		
		List<String> list=new ArrayList<String>();  //Converting Array to List  
		for(String city:array){  
		list.add(city);  
		}  
		System.out.println("List: "+list);  
		  
		}  
		}  
