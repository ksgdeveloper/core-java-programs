package com.shree.java8;

import java.util.stream.IntStream;

public class StreamCalculatingAverage {
	public static void main(String[] args) {
		//Method 1 Print Average from 1 to 30
		float sum = IntStream.range(1,31).sum();
		float avg = sum/30;
		System.out.println(avg);
		
		//Method 2 Print Average from 1 to 30
		IntStream.range(1,31).average().ifPresent(System.out::println);
	}
}
