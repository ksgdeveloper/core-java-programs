package com.shree.java8;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamsListPrimeNumberRange {
	public static void main(String[] args) {
		
		List<Integer> numbers = IntStream.range(1, 101).boxed().collect(Collectors.toList());
		numbers.stream().filter(StreamsListPrimeNumberRange::isPrime).filter(a -> a>2).forEach(e -> System.out.print(e+" "));
	}
	
	public static boolean isPrime(int number) {
		return IntStream.rangeClosed(2, number/2).noneMatch(i -> number%i == 0);
		
	}
}
