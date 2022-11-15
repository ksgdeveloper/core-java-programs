package com.shree.string;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Displays various ways to display String of arrays using
 * Arrays Class
 * String Join method
 * Stream Class java 8 feature
 * @author shrikant
 *
 */


public class StringArrayPrintDemo {
	public static void main(String[] args) {
		
		String[] months = { "January", "February", "March", "April", "May" };
		
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

		// 5. using another way of stream
		System.out.println("\nUsing Streams Another way Sorted");
		Stream<String> stream = Stream.of(months);
		stream.sorted().collect(Collectors.toList()).forEach(System.out::println);

		// 6. Another Stream method
		System.out.println("\nUsing Streams Another way Sorted");
		Arrays.stream(months, 0, 3).sorted().forEach(str -> System.out.print(str + ", "));
	}
}
