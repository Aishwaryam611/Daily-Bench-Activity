package com.inheritance;

public class Moon_IsARelationship {
	public static void main(String args[])
	{
		SolarSystem_ISTypeRelationship s = new SolarSystem_ISTypeRelationship();
		Earth e = new Earth();
		Mars m = new Mars();

		System.out.println(s instanceof SolarSystem_ISTypeRelationship);
		System.out.println(e instanceof Earth);
		System.out.println(m instanceof SolarSystem_ISTypeRelationship);
	}
}

