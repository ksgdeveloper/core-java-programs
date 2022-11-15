package com.shree.java8.streams;

import java.util.Arrays;
import java.util.List;

public class StreamSimpleDemo {

	public static void main(String[] args) {

		List<Integer> integerList = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		integerList.stream().filter(t -> t%2 ==0).forEach(System.out::println);
	}

}
