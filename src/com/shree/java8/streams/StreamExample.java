package com.shree.java8.streams;

import java.util.Arrays;
import java.util.List;

public class StreamExample {
	
	public static void main(String[] args) {
		List<Integer> integerList = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		Integer sum = integerList
						.stream()
							.reduce(0, ArithmeticUtils::add);
		System.out.println(sum);
							
	}
}

class ArithmeticUtils {

    public static int add(int a, int b) {
        return a + b;
    }
}