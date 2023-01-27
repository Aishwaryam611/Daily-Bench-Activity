package com.abstraction;

public abstract class MotorBike {

	abstract void brake();
}

class SportsBike extends MotorBike {

	public void brake() { // implementation of abstract method

		System.out.println("SportsBike Brake");
	}
}

class MountainBike extends MotorBike {

	public void brake() {
		System.out.println("MountainBike Brake");
	}
}

