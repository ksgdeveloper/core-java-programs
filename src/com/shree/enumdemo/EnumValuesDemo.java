package com.shree.enumdemo;

import java.util.Arrays;

public class EnumValuesDemo {
	public static void main(String[] args) {
		
		AppleNew ap;
		//display the price of Winesap
		System.out.println("Price of Winesap Apple :" + AppleNew.Winesap.getPrice());
		
		//Display all apples and values 
		//Using filter by value
		Arrays.stream(AppleNew.values()).filter(e-> e.getPrice() <= 3).
			forEach(e-> System.out.println("Apple of Type "+ e.toString() + " Price : $" + e.getPrice()));

		//Sorting by Name using Array Streams
		System.out.println("Sorting ");
		Arrays.stream(AppleNew.values()).sorted((a,b) -> a.toString().compareTo(b.toString())).
		forEach(e-> System.out.println("Apple of Type "+ e.toString() + " Price : $" + e.getPrice()));
	}
}
//Using enum constructor, instance variable and method
enum AppleNew{
	//Enumerations are called identifier constants
	//implicitly declared public static final member of Apple
	//these constants are self typed
	Jonathan(1), RedDelicious(2), Winesap(3), Kashmir(4);
	private int price;
	
	AppleNew(int p){
		price = p;
	}
	
	int getPrice() {
		return price;
	}
}