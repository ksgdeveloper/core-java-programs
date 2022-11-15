package com.shree.java8.optionals.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.IntBinaryOperator;

public class FunctionalInterfaceDemo {
	public static void main(String[] args) {
		
		lamda_demo();
		forEachMethodDemo();
		sayHello();
		predefined();
	}
	
	
	
	private static void predefined() {
		// TODO Auto-generated method stub
		IntBinaryOperator bo = (a,b) -> (a+b);
		
		System.out.println("Result " + bo.applyAsInt(10, 10) );
		
	}



	private static void sayHello() {
		MyFunctionalInterface mfi = (String str)->{
			return "Hello "+ str;
		};
		System.out.println(mfi.sayHello("Shrikant"));
	}



	public static void lamda_demo() {
		MyInterface fobj = (int x, int y)->System.out.println(x+y);
		System.out.print("The result sum = ");
        fobj.abstract_func(5,5);
        fobj.default_Fun();
        
        fobj = (int x, int y)->System.out.println(x*y);
        System.out.print("The result mul = ");
        fobj.abstract_func(5,5);
        fobj.default_Fun();
	}
	
	public static void forEachMethodDemo() {
		List<String> subList = new ArrayList<>();
        subList.add("Carrot");
        subList.add("Potato");
        subList.add("Cauliflower");
        subList.add("LadyFinger");
        subList.add("Tomato");
        System.out.println("------------Vegetable List--------------");
        subList.forEach(sub -> System.out.print(sub+" "));
        System.out.println();
	}
	
}

