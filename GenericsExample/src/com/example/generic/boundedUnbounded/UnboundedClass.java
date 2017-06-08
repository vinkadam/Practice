package com.example.generic.boundedUnbounded;

public class UnboundedClass<T> {

	T obj;
	
	public UnboundedClass(T obj) {

		this.obj = obj;
	}
	
	public void getClassName() {
		
		System.out.println(obj.getClass().getName());
		
	}
}
