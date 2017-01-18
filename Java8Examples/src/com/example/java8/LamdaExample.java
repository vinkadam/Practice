package com.example.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class LamdaExample {

	public static void main(String[] args) {

		/*
		 * Example 1 */
		List<Developer> listDevs = getDevelopers();

		System.out.println("Before Sort");
		for (Developer developer : listDevs) {
			System.out.println(developer);
		}

		System.out.println("After Sort");

		//lambda here!
		listDevs.sort((Developer o1 , Developer o2)->o1.getAge()-o2.getAge());

		//java 8 only, lambda also, to print the List
		listDevs.forEach((developer)->System.out.println(developer));


		
		/*
		 * Example 2
		List<String> languages = Arrays.asList("Java", "Scala", "C++", "Haskell", "Lisp"); 

		System.out.println("Languages which starts with J :"); 
		filterValues(languages, (str)->(str.startsWith("J"))); 

		System.out.println("Languages which ends with a "); 
		filterValues(languages, (str)->(str.endsWith("a"))); 

		System.out.println("Print all languages :"); 
		filterValues(languages, (str)->true); 

		System.out.println("Print no language : "); 
		filterValues(languages, (str)->false); 

		System.out.println("Print language whose length greater than 4:"); 
		filterValues(languages, (str)->(str.length() > 4)); 
		
		private static void filterValues(List<String> names, Predicate<String> condition) { 

			names.stream().filter((name)->(condition.test(name))).forEach((name)->System.out.println(name + " "));


			//for(String name: names) { 
			//	if(condition.test(name)) { 
			//		System.out.println(name + " "); 
			//	} 
			//}
		
		} */

		

		/*
		 * Example 3
		List<Integer> costBeforeTax = Arrays.asList(100, 200, 300, 400, 500); 
		
		//map
		costBeforeTax.stream().map((cost) -> cost + .12*cost).forEach(System.out::println);
		
		//map and reduce
		double bill = costBeforeTax.stream().map((cost) -> cost + .12*cost).reduce((sum, cost) -> sum + cost).get(); 
		System.out.println("Total : " + bill);*/ 

		/*
		 * Example 4 
		List<String> strList = Arrays.asList("Java", "Scala", "C++", "Haskell", "Lisp");
		long count = strList.stream().filter(x -> x.length()> 3).collect(Collectors.counting()); 
		System.out.printf("Original List : %s, filtered list : %s %n", strList, count); */

	} 
	
	private static List<Developer> getDevelopers() {

		List<Developer> result = new ArrayList<Developer>();

		result.add(new Developer("mkyong", new Integer("70000"), 33));
		result.add(new Developer("alvin", new Integer("80000"), 20));
		result.add(new Developer("jason", new Integer("100000"), 10));
		result.add(new Developer("iris", new Integer("170000"), 55));

		return result;

	}
}
