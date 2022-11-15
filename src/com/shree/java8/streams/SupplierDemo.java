package com.shree.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierDemo {

	public static void main(String[] args) {
		Supplier<Integer> supplier = () -> 10;
		
		supplier.get();
		
		System.out.println(supplier.get() + "World!");
		
		List<Integer> integerList = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		System.out.println(integerList.stream().findAny().orElseGet(supplier));
		
		
		}
}
