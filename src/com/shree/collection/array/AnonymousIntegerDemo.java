package com.shree.collection.array;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class AnonymousIntegerDemo {
	public static void main(String[] args) {
		List<Integer> anonArray = Arrays.asList( 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 );
		List<Integer> list = Arrays.asList(10,0,5,1);
		anonArray.stream().sorted(Comparator.reverseOrder()).forEach(e -> System.out.print(e + " "));
		System.out.println();
		list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);

		int sum = anonArray.stream().mapToInt(Integer::intValue).sum();
		System.out.println("\nTotal Sum "+sum);

		int reduceSum = anonArray.stream().reduce(0, (a,b) -> (a+b));
		System.out.println("\nTotal Sum "+reduceSum);

	}
}
