package com.shree.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

public class StreamUpdateCollectionDemo {
	public static void main(String[] args) {
		// create a list
        List<String> items = new ArrayList<>();
 
        // add elements to the list
        items.add("Shoe");
        items.add("Toy");
 
        // add one or more elements
        Collections.addAll(items, "Fruit", "Bat", "Mouse");
 
        // sorting according to default ordering
        Collections.sort(items);
 
        // print the elements
        for (int i = 0; i < items.size(); i++) {
            System.out.print(items.get(i) + " ");
        }
        System.out.println();
 
        // sorting according to reverse ordering
        Collections.sort(items, Collections.reverseOrder());
 
        // print the reverse order
        for (int i = 0; i < items.size(); i++) {
            System.out.print(items.get(i) + " ");
        }
        System.out.println("\nBefore Updating");
        
        // Displaying through streams
        items.stream().sorted().forEach(e->System.out.print(e+" "));
        
        // Updating stream adding s at the end of strings
        IntStream.range(0,items.size()).forEach(ix -> items.set(ix, items.get(ix).concat("s")));
        
        // Displaying through streams
        System.out.println("\nAfter Updating");
        items.stream().sorted().forEach(e->System.out.print(e+" "));
        
	}
	
	private static String concat(String str) {
		return null;
	}
}
