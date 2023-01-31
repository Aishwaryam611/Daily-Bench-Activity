package com.polymorphism;



	class CarOverRiding extends VehicleOverRiding{  
		  //defining the same method as in the parent class  
		  void run(){System.out.println("car is running safely");}  
		  
		  public static void main(String args[]){  
			  CarOverRiding obj = new CarOverRiding();//creating object  
		  obj.run();//calling method  
		  }  
		}  	
	
	

