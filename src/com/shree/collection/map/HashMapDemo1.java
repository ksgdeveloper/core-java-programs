package com.shree.collection.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo1 {

	public static void main(String[] args) {

		Map<Integer, String> hash_map = new HashMap<>();
		hash_map.put(10, "Geeks");
        hash_map.put(15, "4");
        hash_map.put(20, "Geeks");
        hash_map.put(25, "Welcomes");
        hash_map.put(30, "You");
        
        // Displaying the HashMap
        System.out.println("Initial Mappings are: " + hash_map);
        
        //if the existing key for put then it returns previous value else returns null
        System.out.println(hash_map.put(20,"Nerd"));
        
        System.out.println(hash_map.put(35,"!!"));

        // Displaying the HashMap
        System.out.println("Initial Mappings are: " + hash_map);
        
        
		
	}

}
