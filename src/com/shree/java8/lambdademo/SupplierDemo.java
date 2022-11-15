package com.shree.java8.lambdademo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierDemo {

	public static void main(String[] args) {
		Supplier<String> supplier = () -> "Not Found";
		System.out.println(supplier.get());
		
		List<String> strings = new ArrayList<>();
		System.out.println(strings.stream().findAny().orElseGet(supplier));
		
		strings = Arrays.asList("a","b");
		System.out.println(strings.stream().findAny().orElseGet(supplier));

	}
}
