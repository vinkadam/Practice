package com.example.overriding;

public class BullDog extends AbstractDog {

	@Override
	public void move() {
		System.out.println("Moving");
		
	}

	@Override
	protected void bark() {

		System.out.println("Barking");
	}
	 
}