package com.shree.collection.arraylist;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		//Initializing List of Integers as Array List
		//The list if final, cannot be modified, adding elements will give compile time exception UnsupportedOperationException
		List<Integer> integers = Arrays.asList(1,2,3,4,5,6,7,8,1,2);
		Collections.sort(integers);
		System.out.println(integers);
		
		
		Integer sum = integers.stream().mapToInt(Integer::valueOf).sum();
		
		System.out.println("Sum of List " + sum);
		
		//Prints the Implementation Class
		System.out.println(integers.getClass());
	}

}
