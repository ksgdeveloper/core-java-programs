package com.shree.collection.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayToList {
	public static void main(String[] args) {
		String[] months = {"January", "February", "March", "April", "May"};
		
		//List<String> listMonths = Arrays.asList(months);
		List<String> listMonths = new ArrayList<>(Arrays.asList(months));
		
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
		listMonths.stream().sorted().forEach(e-> System.out.print(e+","));
		
		//display in ascending order
		System.out.println("\ndisplay in ascending order - ");
		listMonths.stream().forEach(e-> System.out.print(e+","));
		
		System.out.println("\ndisplay months count order - " + listMonths.stream().count());
	}
}
