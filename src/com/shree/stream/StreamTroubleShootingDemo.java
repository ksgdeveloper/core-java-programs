package com.shree.stream;

import java.util.stream.LongStream;

public class StreamTroubleShootingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				LongStream.of(1, 2, 3, 4)
		         .filter(e -> e > 2)
		         .peek(e -> System.out.println("Filtered value: " + e))
		         .map(e -> e * e)
		         .peek(e -> System.out.println("Mapped value: " + e))
		         .sum();
		         
	}

}
