package com.shree.collection.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class RemoveDuplicateElementsArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> number = new ArrayList<>(Arrays.asList(9,1,1,2,3,4,5,6,5,6,2,3,7,8,9));
		
		//1. LinkedHashSet as the insertion order is preserved
		LinkedHashSet<Integer> uniqueNumber = new LinkedHashSet<>(number);
		List<Integer> listWithoutDuplicates = new ArrayList<>(uniqueNumber); 
		//Collections.sort(listWithoutDuplicates);
		System.out.println(listWithoutDuplicates);
		
		//2. Using Streams
		List<Integer> uniqueListStreams = number.stream().sorted().distinct().collect(Collectors.toList());
		System.out.println(uniqueListStreams);
		
		//3. Using Set which is also sorted
		Set<Integer> set = new TreeSet<>(Collections.reverseOrder());
		set.addAll(listWithoutDuplicates);
		System.out.println(set);
	}

}
