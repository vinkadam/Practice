package com.example.SampleCodes;


public class Solution2 {

	public static String solution(String S) {
		if (S.length() == 0 || S == null) {
			return S;
		}

		while (S.length() > 0) {

			if (S.contains("AB")) {

				S = S.replace("AB", "AA");
			
			} else if (S.contains("BA")) {
				
				S = S.replace("BA", "AA");
			
			} else if (S.contains("BC")) {
			
				S = S.replace("BC", "BB");
			
			} else if(S.contains("CB")) {
			
				S = S.replace("CB", "BB");
			
			} else if (S.contains("AA")) {
			
				S = S.replace("AA", "A");
			
			} else if (S.contains("CC")) {
			
				S = S.replace("CC", "C");
			
			} else {
				
				break;
			}
		}

		return S;
	}

	
	public static void main(String[] args) {
		
		System.out.println(solution("ABBCC"));
	}
}
