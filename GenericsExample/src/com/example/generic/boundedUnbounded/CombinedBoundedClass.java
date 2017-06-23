package com.example.generic.boundedUnbounded;

public class CombinedBoundedClass<T extends Number & Comparable<?>> {

	public void show() {
		
		System.out.println("In CombinedBoundedClass");
	}
}
