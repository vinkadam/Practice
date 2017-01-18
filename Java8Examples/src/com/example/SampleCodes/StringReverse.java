package com.example.SampleCodes;



public class StringReverse {

	public static void main(String[] args) {

		boolean isValid = validate("({[]})");
		System.out.println(isValid);
	}

	private static boolean validate(String input) {
		
		String str1 = input.substring(0, input.length()/2);
		String str2 = input.substring(input.length()/2, input.length());
		System.out.println(str1);
		System.out.println(str2);
		
		return false;
	}

}
