package com.shree.java8.streams;

import java.util.ArrayList;
import java.util.List;

public class SupplierForEachDemo {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("John");
		list.add("Tony");
		list.add("Peter");
		list.add("James");
		list.add("Jason");
		list.add("Shane");
		
		for (String string : list) {
			System.out.println(string);
		}
		//simplified iteration using stream
		list.stream().forEach(t-> System.out.println(t));
		
	}

}
