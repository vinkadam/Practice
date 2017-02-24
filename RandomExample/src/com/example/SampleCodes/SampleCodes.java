package com.example.SampleCodes;

class Vehicle{  
	void run(){System.out.println("Vehicle is running");}  
}  

public class SampleCodes extends Vehicle{  

	void run() {
		System.out.println("Vehicle is running in samplecodes");
	}
	public static void main(String args[]){  
		SampleCodes obj = new SampleCodes();  
		obj.run();  
	}  
}  
