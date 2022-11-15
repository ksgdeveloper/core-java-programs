package com.shree.java8.streams;

import java.util.Arrays;
import java.util.List;

public class MethodReferenceDemo {
	public static void main(String[] args) {
		
		List<String> messages = Arrays.asList("hello", "baeldung", "readers!");
		
		messages.stream().map(String::valueOf).forEach(System.out::println);
		
	}
}
