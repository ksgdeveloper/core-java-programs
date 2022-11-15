package com.shree.collection.map;

import java.util.HashMap;
import java.util.Map;

/*
 * HashMap uses hash table data structure
 * key value pairs, keys are unique
 * it implements Map interface
 * 
 */
public class HashMapMethodDemo{
	
	public static void main(String[] args) {
		//putMethodDemo();
		putAllMethodDemo();
	}

	private static void putAllMethodDemo() {

	    // create an HashMap
	    HashMap<Integer, String > primeNumbers = new HashMap<>();
	    primeNumbers.put(2, "Twoo");
	    primeNumbers.put(3, "Three");
	    primeNumbers.put(5, "Five");
	    primeNumbers.put(7, "Seven");
	    
	    HashMap<Integer, String > numbers = new HashMap<>();
	    numbers.put(2, "Two");
	    numbers.put(1, "One");
	    numbers.putAll(primeNumbers);
	    System.out.println("HashMap: "+numbers);
	}

	private static void putMethodDemo() {
		// create an HashMap
	    HashMap<String, String> countries = new HashMap<>();
	    // insert items to the HashMap
	    countries.put("Washington", "America");
	    countries.put("Ottawa", "Canada");
	    countries.put("Kathmandu", "Nepal");
	    System.out.println("Countries: " + countries);

	    // add element with duplicate key
	    String value = countries.put("Washington", "USA");
	    System.out.println("Updated Countries: " + countries);

	    // display the replaced value
	    System.out.println("Replaced Value: " + value);
	    System.out.println("HashMap size: " + countries.size());
		
	}

}
