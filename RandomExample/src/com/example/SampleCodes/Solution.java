package com.example.SampleCodes;

import java.text.ParseException;
import java.time.LocalTime;

public class Solution {

	public static int solution(String E, String L) throws ParseException {

		LocalTime date1 = LocalTime.parse(E);

	    LocalTime date2 = LocalTime.parse(L);
	    
	    int loop = date2.getHour() - date1.getHour();

	    int date2Minute = date2.getMinute();

	    int n1 = 0,n2 = 2, counter = 0;
	    
	    while(loop-1 > 0) {
	    	
	    	counter ++;
	    	loop = loop -1;
	    }
	    
	    if(counter != 1)
	    	n1 = counter * 4;
	    
	    n2 = n2 + n1 + 3;
	    
	    if(date2Minute > 0)
	    	n2 = n2 + 4;
	    
	    return n2;
	}
	
	public static void main(String[] args) {
	
		try {
			System.out.println("solution: "+solution("10:00", "13:20"));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
