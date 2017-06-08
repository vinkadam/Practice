package com.example.generic.simple;

import java.util.ArrayList;
import java.util.List;

public class SimpleCollection {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		
		List l1 = new ArrayList();
		l1.add("String");
		l1.add(new Integer(10));
		
		for (Object object : l1) {
			
			String s = (String) object; //Need to cast always and run time error for Integer
			System.out.println(s);
			
		}
	}
}
