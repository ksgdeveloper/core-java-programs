package com.shree.collection.map;

import java.util.AbstractMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SimpleEntryDemo {
	public static void main(String[] args) {
		Map<Integer, String> map = Stream.of(
			new AbstractMap.SimpleEntry<>(1, "one"),
			new AbstractMap.SimpleEntry<>(2, "two"),
			new AbstractMap.SimpleEntry<>(3, "three")
			).collect(Collectors.toMap(Map.Entry:: getKey, Map.Entry::getValue));
		
		System.out.println(map);
		map.forEach((k,v)-> System.out.println("Key " + k + ", Value " + v) );
	}
}
