package com.example.generic.boundedUnbounded;

public class BoundedClass<T extends Number> {

	T obj;

	public BoundedClass(T obj) {

		this.obj = obj;
	}

	public void getClassName() {

		System.out.println(obj.getClass().getName());

	}
}
