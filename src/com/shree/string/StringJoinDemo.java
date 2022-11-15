package com.shree.string;

public class StringJoinDemo {

	public static void main(String[] args) {
		//String.join new feature of Java 8 for joining string with a delimiter
		String result = String.join(" ", "Shrikant", "Gopinath", "M", "38", "kgshrikant@gmail.com");
		System.out.println(result);
		result = String.join(", ", "Shrikant", "Gopinath", "M", "38", "kgshrikant@gmail.com");
		System.out.println(result);
		
	}

}
