package com.shree.designpattern;

import java.io.Serializable;

public class Singleton implements Serializable {
	//static variable declaration only one instance is created	
	private static Singleton instance;
	
	private Singleton() {
		System.out.println("Singleton() :  Initializing Instance");
	}

	public static Singleton getInstance() {
		if(instance == null) {
			synchronized(Singleton.class){
				
				System.out.println("getInstance(): First time getInstance was invoked!");
				instance = new Singleton();
			}
		}
		return instance;
	}
	
	public void doSomething() {
		System.out.println("doSomething(): Singleton does something!");
	}
	
	// This method is called immediately after an object of this class is deserialized.
	// This method returns the singleton instance.
	protected Object readResolve() {
		return getInstance();
	}
}
