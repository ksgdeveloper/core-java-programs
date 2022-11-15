package com.shree.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorDemo {

	public static void main(String[] args) {
		List<String> strList = new ArrayList<>(
				Arrays.asList("d","dd","ddd","dddd","ddddd"));
		ListIterator<String> iterator = strList.listIterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}
