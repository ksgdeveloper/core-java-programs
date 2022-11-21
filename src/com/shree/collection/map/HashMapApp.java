package com.shree.collection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapApp {

	public static void main(String[] args) {
		Map<String, String> maps = new HashMap<String, String>() {{
			put("1","one");
			put("2","two");
			put("3","three");
			put("4","four");
		}};
		
		//traditional way display elements
		System.out.println("Intiailized Values " + maps);
		
		//remove elements using key
		System.out.println("Removing Element with key 4 " + maps);
		maps.remove("4");
		
		//insert element using key value pair
		System.out.println("Inserting element at position 5" + maps);
		maps.put("5", "five");
		
		
		//replacing elements using put method
		System.out.println("HashMap contains key 2 " + maps.containsKey("2"));
		System.out.println(maps.put("2", "do"));
		System.out.println("replacing key value of two by " + maps.get("2"));
		System.out.println(maps);
				
		//method 1
		for(Map.Entry<String, String> entry : maps.entrySet()) {
			System.out.println("Key " +entry.getKey()+ " Value " + entry.getValue());
		}
		
		//method 2
		System.out.println("Display element using streams");
		maps.forEach((k,v) -> System.out.println("Key "+ k + " Value " + v));
		
		System.out.println("\nUsing Iterator Looping");
		Iterator<Map.Entry<String, String>> itr = maps.entrySet().iterator();
		while(itr.hasNext()) {
			Map.Entry<String, String> entry = itr.next();
			System.out.println("Key " +entry.getKey()+ " Value " + entry.getValue());
		}
		System.out.println("\n");
		
		//Display all keys in one line
		maps.keySet().stream().forEach(k -> System.out.print(k +"=" + maps.get(k) + ","));
		//Display all values in one line
		System.out.println();
	
		maps.values().stream().forEach(v -> System.out.print(v +" "));
		
	}
}
