package com.shree.collection.array;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class ArraysClassDemo {
	public static void main(String[] args) {
		List<String> months = Arrays.asList("January", "February", "March", "April", "May");
		
		System.out.println(months);
		//displays [Ljava.lang.String;
		
		// 1. Using Arrays as
		System.out.println("\nUsing Arrays");
		System.out.println(Arrays.asList(months));

		// 2. Using
		System.out.println("\nUsing String Join method");
		System.out.println(String.join(", ", months));

		// 3. Using Streams Class
		System.out.println("\nUsing Streams");
		Stream.of(months).forEach(System.out::println);

		// 4. Using Streams Class Sorted
		System.out.println("\nUsing Streams Another way Sorted");
		Arrays.asList(months).stream().sorted().forEach(System.out::println);

		String[] arrayMonths = new String[months.size()];
		months.toArray(arrayMonths);
		
		// 5. using another way of stream
		System.out.println("\nUsing Streams Another way Sorted");
		Stream<String> stream = Stream.of(arrayMonths);
		stream.sorted().collect(Collectors.toList()).forEach(System.out::println);

		// 6. Another Stream method
		System.out.println("\nUsing Streams Another way Sorted");
		Arrays.stream(arrayMonths, 0, 3).sorted().forEach(str -> System.out.print(str + ", "));
		
		// 7. Find First Element by sorting order
		System.out.println("\nFind First Element by sorting order");
		Stream.of(arrayMonths).sorted().findFirst().ifPresent(System.out::println);
		
	}
}
