package com.encapsulation;


public class Test {
	public static void main(String[] args) {
		

		Customer cust = new Customer();
		
		cust.setFirstName("Aish");
		cust.setLastName("more");
		cust.setCreditCard("1234");
		
		System.out.println("1..."+ cust.getFirstName());
		System.out.println("2..."+ cust.getLastName());
		System.out.println("3..."+ cust.getCreditCard());
		
		
		
}}
