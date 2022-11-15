package com.shree.collection;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {
	public static void main(String[] args) {
		Map<Integer,String> tree_map = new TreeMap<Integer, String>();
		System.out.println("Tree Map Created, has contents - " + tree_map.isEmpty());
		
		// Mapping string values to int keys
        tree_map.put(10, "Geeks");
        tree_map.put(15, "4");
        tree_map.put(20, "Geeks");
        tree_map.put(25, "Welcomes");
        tree_map.put(30, "You");
        // Print Map TreeMap
        System.out.println(tree_map);
        
        // Check if the key is present
        System.out.println(
                "\nIs key \""
                + 50 + "\" present? "
                + tree_map.containsKey(50));
        
        // Check if the value is present
        System.out.println(
                "\nIs value Geeks \" present? "
                + tree_map.containsValue("Geeks"));
        
        // traversing through the TreeMap
        for(Map.Entry<Integer,String> ss : tree_map.entrySet()) {
        	System.out.println("key "+ss.getKey()+ " value " +ss.getValue());
        }
        
        tree_map.entrySet().stream().forEach(System.out::println);
        tree_map.forEach((k,v) -> System.out.println(k+" "+ v));
	}
}
