package com.example.overriding;


public class Overriding {

	public static void main(String[] args) {
		
		Parent p = new Child();
		p.printThis();
		p.sleep();
		
		System.out.println("*********");
		
		Child c = new Child();
		c.doSomething();
		c.sleep();
		c.printThis();
	}
}
