package com.shree.collection.array;

import java.util.Arrays;

public class Array2DDemo {

	public static void main(String[] args) {

		String[][] names = { {"Sam", "Smith"},
                {"Robert", "Delgro"},
                {"James", "Gosling"},
              };
		System.out.println(names);
		
		//Traditional Method
		System.out.println("Traditional Query");
		for(String[] a : names) {
			for(String b :a)
				System.out.print(b+ " ");
		}
		
		//Java 8 Method
		System.out.println("Java 8 Method");
		Arrays.stream(names).map(a -> String.join(" ",a)).forEach(e-> System.out.println(e));
		
		//display contents of array multidimensional arrays
		System.out.println(Arrays.deepToString(names));
	}

}
