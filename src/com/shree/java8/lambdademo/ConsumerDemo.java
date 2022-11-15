package com.shree.java8.lambdademo;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {

	public static void main(String[] args) {
		
		Consumer<Integer> consumer = (t) -> System.out.print(" " + t);
		consumer.accept(10);
		
		List<Integer> integers = Arrays.asList(1,2,3,4,5,6,7,8,9);
		integers.forEach(consumer);
	}
}
