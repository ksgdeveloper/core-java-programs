package com.shree.java8.lambda;
@FunctionalInterface
public interface MyInterface {

	//should contain only one abstract method
    void abstract_func(int x,int y);
 
	default void default_Fun()
    {
         System.out.println("This is default method");
    }
}
