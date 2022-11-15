package com.shree.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class PredicateDemo {

	public static void main(String[] args) {
		
		Predicate<Integer> predicate = (t) -> {
			if(t%2 == 0) {
				return true;
			}else {
				return false;
			}
		};

		System.out.println(predicate.test(7));
		
		//adding Predicate and Consumer 
		Consumer<Integer> consumer = t -> System.out.println("Printing : " + t);
		
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);
		//adding predicate 
		list.stream().filter(predicate).forEach(consumer);
		
		//simplified in stream api
		list.stream().filter(t->  t%2 ==0).forEach(System.out::println);
	}

	
}
