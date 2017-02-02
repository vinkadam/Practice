package com.example.overriding;

public class Child extends Parent {


	public void printThis() {
		System.out.println("In Child ");
	}

	static void sleep() {
		System.out.println("Child sleeps");
	}
	
	void doSomething() {
        sleep();    // this calls the hiding method
 
        // because the Animal's sleep() is hidden, it requires to use
        // a fully qualified class name to access it.
        Parent.sleep();
    }
}
