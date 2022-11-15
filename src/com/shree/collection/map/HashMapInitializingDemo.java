package com.shree.collection.map;

import java.util.AbstractMap;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HashMapInitializingDemo {
	public static Map<String, String> articleMapOne;
	static {
	    articleMapOne = new HashMap<>();
	    articleMapOne.put("ar01", "Intro to Map");
	    articleMapOne.put("ar02", "Some article");
	}


	public static void main(String[] args) {

		articleMapOne.put("ar03", "Another article");
		System.out.println(articleMapOne);
		
		Map<String, String> doubleBraceMap  = new HashMap<>() {{
		    put("key1", "value1");
		    put("key2", "value2");
		}};
		doubleBraceMap.put("key3", "value3");
		System.out.println(doubleBraceMap);
		
		Map<String, String> createSingletonMap  = Collections.singletonMap("key1", "value1" );
		
		System.out.println(createSingletonMap);
		
		//using java 8 initialization as both String as key value pairs
		Map<String, String> mapStringStream = Stream.of(new Object[][] {
			{"1", "one"},
			{"2", "two"},
			{"3", "three"},
		}).collect(Collectors.toMap(data -> (String)data[0] , data -> (String)data[1]  ));
		System.out.println(mapStringStream);
		
		//using java 8 initialization as both key as Integer and value as String
		Map<Integer, String> mapStream = Stream.of(new Object[][] {
			{1, "one"},
			{2, "two"},
			{3, "three"},
		}).collect(Collectors.toMap(data -> (Integer)data[0] , data -> (String)data[1]  ));
		System.out.println(mapStream);
		
		//using java 8 Map.of method initialization as both String as key value pairs
		//limits intialiazation upto 10 key value pairs
		Map<String, String> java9Mapvariable = Map.of("key1","value1", "key2", "value2");
		System.out.println(java9Mapvariable);
		
		Map<String, String> mapOfEntries = Map.ofEntries(
			new AbstractMap.SimpleEntry<>("1","one"),	
			new AbstractMap.SimpleEntry<>("2","two"),	
			new AbstractMap.SimpleEntry<>("3","three")	
			);
		System.out.println(mapOfEntries);


	}

}
