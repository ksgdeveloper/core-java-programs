package com.shree.java8.funtionalinterface;

public class CalculatorImpl {

	public static void main(String[] args) {
		Calculator calc = (a,b) -> System.out.println("Lambda Method Demo "+(a+b));
		calc.calculate(10,20);
	}
}

@FunctionalInterface
interface Calculator{
	void calculate(int a, int b);
}