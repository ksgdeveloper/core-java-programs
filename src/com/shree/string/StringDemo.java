package com.shree.string;

import java.text.DateFormatSymbols;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StringDemo {

	public static void main(String[] args) {

		List<String> monthList = Arrays.asList("January","Feburary","March","April","May","June","July","August","September","October","November","December");
		
		monthList.stream().forEach(x -> System.out.print(x+" "));
		System.out.println("\n Sorted alphabatically");
		monthList
		.stream()
				.sorted()
						.forEach(e-> System.out.print(e+" "));
		System.out.println("\n");
		monthList
		.stream()
				.sorted((String o1, String o2) -> o1.compareTo(o2))
						.forEach(e-> System.out.print(e+" "));
	
		
		System.out.println("\n");
		monthList
			.stream()
					.sorted(Comparator.reverseOrder())
							.forEach(e-> System.out.print(e+" "));
		
		String[] months = new DateFormatSymbols().getMonths();
		
		System.out.println("\n"+Arrays.asList(months));
		
		Arrays.stream(months).sorted().forEach(e-> System.out.print(e.toUpperCase()+" "));

	}
}
