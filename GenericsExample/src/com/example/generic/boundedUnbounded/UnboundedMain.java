package com.example.generic.boundedUnbounded;

public class UnboundedMain {

	public static void main(String[] args) {
		
		UnboundedClass<Integer> unb1 = new UnboundedClass<Integer>(10);
		unb1.getClassName();
		
		UnboundedClass<String> unb2 = new UnboundedClass<String>("String");
		unb2.getClassName();
		
	}

}
