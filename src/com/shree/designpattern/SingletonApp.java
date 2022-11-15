package com.shree.designpattern;
/**
 * Particularly used in where only one instance is requied 
 * 1. LoggerClass
 * 2. Configuration Class
 * 3. Accessing resources
 * 4. FactoryClasses are implemented as Singletons
 * 
 */
public class SingletonApp {
	public static void main(String[] args) {
		
		Singleton s = Singleton.getInstance();
		Singleton s1 = Singleton.getInstance();
		
		//check if the references are same
		System.out.println(s==s1);
		
	}
}
