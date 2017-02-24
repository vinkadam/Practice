package com.example.SampleCodes;

import java.util.EnumMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Test {

	public static void main(String[] args) {
		
		/*String isExists = "Y";
		
		if(isExists.equals("Y")) {
			System.out.println("true");
		}*/
		//System.out.println(isExists == "Y" ? true : false);
		/*A a = new B();
		a.m1();
		a.m2();

		B b = new B();
		b.m1();
		b.m2();
		b.m3();*/

		Map<Colors, String> map = new HashMap<Colors, String>();
		map.put(Colors.BLACK, "Black");
		map.put(Colors.RED, "Red");
		map.put(Colors.BLUE, "Blue");
		Iterator<Colors> mapKeySet = map.keySet().iterator();
        while(mapKeySet.hasNext()){
        	Colors currentState = mapKeySet.next();
            System.out.println("key : " + currentState + " value : " + map.get(currentState));
        }
        
        System.out.println("********************************");
        System.out.println("EnumMap will print items in order that it is declared in Enum");
        Map<Colors, String> mapEnum = new EnumMap<Colors, String>(Colors.class);
		mapEnum.put(Colors.BLACK, "Black");
		mapEnum.put(Colors.RED, "Red");
		mapEnum.put(Colors.BLUE, "Blue");
		
		Iterator<Colors> enumKeySet = mapEnum.keySet().iterator();
        while(enumKeySet.hasNext()){
        	Colors currentState = enumKeySet.next();
            System.out.println("key : " + currentState + " value : " + mapEnum.get(currentState));
        }


	}

}
