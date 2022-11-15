package com.shree.collection.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

public class CollectionsDemo {
	public static void main(String[] args) {
		// create a list
        List<String> items = new ArrayList<>();
 
        // add elements to the list
        items.add("Shoe");
        items.add("Toy");
        System.out.println("Before addAll Method " + items);
        
        // add one or more elements
        Collections.addAll(items, "Fruit", "Bat", "Mouse");
        System.out.println("After addAll method " + items);
        
        // sorting according to default ordering
        Collections.sort(items);
        System.out.println("After sorting method " + items);
 
        // print the elements
        for (int i = 0; i < items.size(); i++) {
            System.out.print(items.get(i) + " ");
        }
        
        // sorting according to reverse ordering
        Collections.sort(items, Collections.reverseOrder());
        System.out.println("\nAfter sorting in descending order " + items);
        // print the reverse order
        
        // Displaying through streams
        System.out.println("Displaying Sorting results through streams ");
        items.stream().sorted().forEach(e->System.out.print(e+" "));
        
        // Displaying in reverse Order
        items.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
        //items.forEach(e -> System.out.print(e+ " "));
        
        // Updating stream adding s at the end of strings
        System.out.println();
        IntStream.range(0,items.size()).forEach(ix -> items.set(ix, items.get(ix).concat("s")));
        
        // Displaying through streams
        System.out.println("After Updating (s)");
        items.stream().forEach(e->System.out.print(e+" "));
        
	}
}
