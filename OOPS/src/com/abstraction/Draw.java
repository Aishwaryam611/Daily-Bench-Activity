package com.abstraction;

public interface Draw {     //Interface declaration: by first user

	void draw();  
	} 


	//Implementation: by second user  
	class Rectangle implements Draw{  
	public void draw(){System.out.println("drawing rectangle");}  
	}  
	
	class Circle implements Draw{  
	public void draw(){System.out.println("drawing circle");}  
	}  
	
	
	
	
	

