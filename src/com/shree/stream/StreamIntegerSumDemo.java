package com.shree.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamIntegerSumDemo {

	public static void main(String[] args) {
		List<Integer> integers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		//
		Integer sum = integers
						.stream()
							.reduce(0,ArithmeticUtils::add);
		System.out.println(sum);
		
		Integer anotherSum = integers
								.stream()
									.reduce(0,Math::addExact);
		System.out.println(anotherSum);
		
		anotherSum = integers
						.parallelStream()
							.reduce(0,Integer::sum);
		System.out.println(anotherSum);
		
		Integer newSum = integers
								.stream()
				  						.collect(Collectors.summingInt(Integer::intValue));
		System.out.println(newSum);
		
		Integer newSum1 = integers
								.stream()
				  					.mapToInt(Integer::intValue)
				  						.sum();
		System.out.println(newSum1);
		
		
	}

}

 class ArithmeticUtils {

    public static int add(int a, int b) {
        return a + b;
    }
}