package com.stringExamples;

public class StringComparison {

	 public static void main(String args[]){ 
	
	
	String s1="Aish";  
	   String s2="Aish";  
	   String s3=new String("Aish");  
	   String s4="Sam";  
	 
	   String s5="Sachin";  
	   String s6="SACHIN";   
	   
	   System.out.println(s1.equals(s2));     //true  
	   System.out.println(s1.equals(s3));     //true  
	   System.out.println(s1.equals(s4));    //false  
	   
	   System.out.println(s5.equals(s6));//false  
	   System.out.println(s5.equalsIgnoreCase(s6));//true  
	 
	 }
}
