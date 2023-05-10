package com.shree.collection.array;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class AnonymousIntegerDemo {
	public static void main(String[] args) {
		int[] anonArray = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		List<Integer> list = Arrays.asList(10,0,5,1);
		Arrays.stream(anonArray).sorted().forEach(e -> System.out.print(e + " "));
		System.out.println();
		list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
		int sum = Arrays.stream(anonArray).sum();
		System.out.println("\nTotal Sum "+sum);

		String str[] = new String[] { "hard", "work", "works" };
		for (String s : str) {
			System.out.print(s + ",");
		}
	}
}
