package com.shree.collection.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ArrayToList {
	public static void main(String[] args) {
		String[] months = {"January", "February", "March", "April", "May"};
		
		//List<String> listMonths = Arrays.asList(months); //unmodifiable list
		
		//Modifiable list when its been passed in as argument
		List<String> listMonths = new ArrayList<>(Arrays.asList(months));
		listMonths.stream().forEach(str -> {
			if(str.length() == 5){
				System.out.println("Month: "+ str);
				return;
			}
		});
		listMonths.add("June");
		listMonths.set(0,"Jan");
		System.out.println("Collection Sort method");
		Collections.sort(listMonths);
		System.out.println(listMonths);
		
		System.out.println("Collection Sort reverse method");
		Collections.reverse(listMonths);
		System.out.println(listMonths);
		
		//display list
		
		listMonths.stream().forEach(e-> System.out.print(e+","));
		
		//display in ascending order
		System.out.println("display in ascending order");
		listMonths.stream().sorted((String o1, String o2) -> o1.compareTo(o2)).forEach(e-> System.out.print(e+","));
		
		//display in ascending order
		System.out.println("\ndisplay in ascending order - ");
		listMonths.stream().forEach(e-> System.out.print(e+","));
		
		System.out.println("\ndisplay months count order - " + listMonths.stream().count());
	}
}
