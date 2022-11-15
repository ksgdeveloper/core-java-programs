package com.shree.java8;

import java.util.Arrays;
import java.util.List;


public class StreamSortAndFilter {
	public static void main(String[] args) {
		
		//Sorting Arrays
		System.out.println("Names Ending with 'a'");
		String[] names = {"Al", "Ankit", "Kushal", "Brent", "Sarika", "Amanda", "Hans", "Shivika", "Sarah","sandy"};
		Arrays.stream(names).sorted().filter(a -> a.endsWith("a")).forEach(e-> System.out.print(e+","));
		System.out.println();
		
		//Sorting List and filtering with name starting with
		System.out.println("Names Starting with 'S'");
		List<String> namesList = Arrays.asList(names);
		namesList.stream().filter(x -> x.startsWith("S")).sorted().forEach(e -> System.out.print(e+","));
		
		//Ignoring the case and filter
		System.out.println();
		System.out.println("Names Starting with 's' in lowercase");
		Arrays.stream(names).map(String::toLowerCase).filter(x -> x.startsWith("s")).forEach(x -> System.out.print(x + " "));
		
	}
}
