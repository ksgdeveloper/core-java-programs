package com.shree.collection.arraylist;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListToArray {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("Mango","Orange","Banana","Papaya", "DragonFruit");

		System.out.println("Display Original List");
		System.out.println(list);
		
		System.out.println("Display List elements sorted");
		Collections.sort(list);
		System.out.println(list);
		
		System.out.println("Display List elements reverse order");
		Collections.sort(list, Collections.reverseOrder());
		System.out.println(list);
		
		
		String[] str = new String[list.size()];
		list.toArray(str); //copies the list to an array
		
		//sorting in descending order
		System.out.println("\nUsing Streams sorting in descending order ********");
		Arrays.stream(str).sorted((a,b) -> b.compareTo(a)).forEach(e -> System.out.print(e + ", "));
		System.out.println("");
		
		//sorting in ascending order
		System.out.println("\nUsing Streams sorting in ascending order ********");
		Arrays.stream(str).sorted((a,b) -> a.compareTo(b)).forEach(e -> System.out.print(e + ", "));
	}

}
