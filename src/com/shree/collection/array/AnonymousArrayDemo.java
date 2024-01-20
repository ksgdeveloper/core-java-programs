package com.shree.collection.array;

import java.util.Arrays;
import java.util.Comparator;

public class AnonymousArrayDemo {

	public static void main(String[] args) {
		int [] anonArray = new int[] {1,2,3,4,5,6,7,8,9,10};
		int sum = 0;
		//using java 7
		for(int a : anonArray) {
			sum += a;
		}
		System.out.println(sum);

		//using java 8+
		Arrays.stream(anonArray).sorted().forEach(e-> System.out.println(e+" "));

		//using java 7
		String str[] = new String[] {"hard", "work", "works"};
		for(String s : str ) {
			System.out.println(s+" ");
		}

		//using java 8+
		Arrays.stream(str).sorted(Comparator.reverseOrder()).forEach(System.out::println);
	}

}
