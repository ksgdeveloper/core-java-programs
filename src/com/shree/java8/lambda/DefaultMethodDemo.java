package com.shree.java8.lambda;

public class DefaultMethodDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DerivedClass dc = new DerivedClass();
		dc.default_method();
	}

}

interface InterfaceDefault{
	default void default_method(){
        System.out.println("We are default method of interface");
   }
}

class DerivedClass implements InterfaceDefault {
	 
}