package com.polymorphism;

public class TestShape {

	public static void main(String[] args) {
        Shape s1 = new Circle();
        Shape s2 = new Square();

        s1.draw(); 
        s2.draw(); 
    }
}
