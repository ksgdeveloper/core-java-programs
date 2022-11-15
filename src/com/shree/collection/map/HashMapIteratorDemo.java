package com.shree.collection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapIteratorDemo {

	public static void main(String[] args) {
		Map<Integer,String> map = new HashMap<>();
		
		map.put(1,"A");
		map.put(2,"B");
		map.put(3,"C");
		map.put(4,"D");
		map.put(5,"E");
		map.put(6,"F");
		
		//iterating inside the hashmap
		System.out.println("iteration using the hashmap for loop");
		for(Integer val: map.keySet()) {
			System.out.println(val+","+map.get(val));
		}
		
		System.out.println("1. iteration using the hashmap for loop");
		for(Integer val: map.keySet()) {
			System.out.println(val+","+map.get(val));
		}
		
		System.out.println("2. using for-each loop iteration Map Entry");
		for(Map.Entry <Integer, String> entry: map.entrySet()) {
			System.out.println(entry.getKey()+","+entry.getValue());
		}
		
		System.out.println("3. using Iterator entry set while method");

		Iterator<Map.Entry<Integer,String>> itr = map.entrySet().iterator();
		while(itr.hasNext()) {
			Map.Entry<Integer, String> entry = itr.next();
			System.out.println(entry.getKey() +" " +entry.getValue());
		}
		
		System.out.println("4. Using map forEach iteration");

		//	simplified iteration using stream
		//	directly calling forEach method
		map.forEach((k,v)-> System.out.println(k+"="+v));
		
		//	calling map entryset function converting to stream and forEach method
		System.out.println("5. Using map entry set and converting to streams");
		map.entrySet().stream().forEach(System.out::println);
		
	
	}

}
