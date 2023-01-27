package com.encapsulation;



public class AccTest {
public static void main(String[] args) {  
	    
		//creating instance of Account class 
		Account acc=new Account(); 
	    
	    //setting values through setter methods  
	    acc.setAccNo(564738922L);  
	    acc.setName("Aishwarya");  
	    acc.setEmail("aish@gmail.com");  
	    acc.setAmount(500000f);  
	    
	    //getting values through getter methods  
	    System.out.println(acc.getAccNo()+" "+acc.getName()+" "+acc.getEmail()+" "+acc.getAmount());  
	}  
	}  
	
