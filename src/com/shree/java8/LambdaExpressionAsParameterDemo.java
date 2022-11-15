package com.shree.java8;

import java.util.Arrays;
import java.util.List;

public class LambdaExpressionAsParameterDemo {
	public static void main(String[] args) {
		//creating an arraylist
		List<String> languages = Arrays.asList("Java", "Python", "JavaScript");
		
		System.out.println("Original String " + languages);
		
		//change to upper case
		languages.replaceAll(e -> e.toUpperCase());
		
		System.out.println("String Upper Case " + languages);
		
		//change to reverse string
		languages.replaceAll((e) -> {
			StringBuilder sb = new StringBuilder(e);
			sb.reverse();
			return sb.toString();	
		});
		
		System.out.println("After String reverse " + languages);
		
	}
}
