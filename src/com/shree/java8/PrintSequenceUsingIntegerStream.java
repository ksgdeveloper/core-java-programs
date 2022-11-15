package com.shree.java8;

import java.util.stream.IntStream;

public class PrintSequenceUsingIntegerStream {
	public static void main(String[] args) {
		//Print Series 1 to 100
		IntStream.range(1,31).forEach(e-> System.out.print(e+" "));
		
		// between range 11 - 20
		System.out.println();
		IntStream.range(11,21).forEach(e-> System.out.print(e+" "));
		
		// between range 1 - 11, skip until 5
		System.out.println("");
		IntStream.range(1,11).skip(5).forEach(e-> System.out.print(e+" "));
		
		//sum between range 1 - 10
		System.out.println();
		System.out.println("Sum of numberts between 1 to 10 - " + IntStream.range(1,11).sum());
		
	}
}
