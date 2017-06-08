package com.example.generic.boundedUnbounded;

public class BoundedMain {

	public static void main(String[] args) {

		BoundedClass<Integer> bc1 = new BoundedClass<Integer>(10);
		bc1.getClassName();
		
		BoundedClass<Float> bc2 = new BoundedClass<Float>(10f);
		bc2.getClassName();
		
		BoundedClass2<Thread> bc3 = new BoundedClass2<Thread>();
		bc3.getClassName();
		
		BoundedClass2<Example> bc5 = new BoundedClass2<Example>();
		bc5.getClassName();
		
		//Compile Error: The type String is not a valid substitute for the bounded parameter 
		//BoundedClass<String> bc6 = new BoundedClass<String>("String");
		//bc6.getClassName();

	}

}
