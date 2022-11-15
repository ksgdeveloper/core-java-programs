package com.shree.collection.arraylist;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ArrayListJava8Demo {

	public static void main(String[] args) {
		//intializing values using Collection in Java 8 Streams
		Collection<Integer> numbers = IntStream.range(1, 11).boxed().collect(Collectors.toSet());
		List<Integer> list = new ArrayList<>(numbers);
		System.out.println(numbers);
		
		//Another initialization using only Java8 Streams
		List<Integer> newList = new ArrayList<>(
				  IntStream.range(1, 11).boxed().collect(Collectors.toCollection(ArrayList::new))
				  );
		System.out.println(newList);
		Collections.reverse(newList);
		System.out.println("After reverse Collections " + newList);
		
  
	}

}
