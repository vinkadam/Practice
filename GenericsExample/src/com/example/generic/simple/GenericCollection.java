package com.example.generic.simple;

import java.util.ArrayList;
import java.util.List;

public class GenericCollection {

public static void main(String[] args) {
		
		List<String> l1 = new ArrayList<String>();
		l1.add("String");
		//l1.add(new Integer(10)); //Compile time error
		
		for (String object : l1) {
			
			String s = object; //No need to cast always
			System.out.println(s);
			
		}
	}
}
