package com.shree.enumdemo;

import java.util.Arrays;

/**
 * enum 
 * Enumerations
 * @author shrikant
 *
 */
public class EnumDemo1 {
	public static void main(String[] args) {
		//Declaration of enum
		//Only Apple Identifiers can be assigned to variable ap
		Apple ap = Apple.Kashmir;
		
		System.out.println(ap);
		//equality relational operator 
		System.out.println((ap == Apple.Kashmir));
		
		//Qualified identifier constants can be used instead of full Qualifier Enumeration Type
		switch(ap) {
		case Jonathan: System.out.println("Apple chosen " + Apple.Jonathan); 
			break;
		case RedDelicious: System.out.println("Apple chosen " + Apple.RedDelicious); 
			break;
		case Winesap: System.out.println("Apple chosen " + Apple.Winesap); 
			break;
		case Kashmir: System.out.println("Apple chosen " + Apple.Kashmir); 
			break;
		}
		
		//values() and valueOf() method 
		System.out.println("ValuesOf method for Jonathan  - " + Apple.valueOf("Jonathan"));
		
		//declaring values to Array
		Apple allApple[] = Apple.values();
		Arrays.stream(allApple).forEach(e-> System.out.print(Apple.valueOf(e.toString()) + " "));
	}
}

enum Apple{
	//Enumerations are called identifier constants
	//implicitly declared public static final member of Apple
	//these constants are self typed
	Jonathan, RedDelicious, Winesap, Kashmir
}