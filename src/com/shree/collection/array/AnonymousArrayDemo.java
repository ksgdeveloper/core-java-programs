package com.shree.collection.array;

import java.util.Arrays;

public class AnonymousArrayDemo {

	public static void main(String[] args) {
		int [] anonArray = new int[] {1,2,3,4,5,6,7,8,9,10};
		int sum = 0;
		for(int a : anonArray) {
			sum += a;
		}
		System.out.println(sum);
		Arrays.stream(anonArray).sorted().forEach(e-> System.out.println(e+" "));

		String str[] = new String[] {"hard", "work", "works"};
		for(String s : str ) {
			System.out.print(s+" ");
		}
	}

}
