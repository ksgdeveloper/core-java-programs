package com.shree.enumdemo;

public class EnumConstantsDemo {
	public static void main(String[] args) {
		Color []color = Color.values();
		for(Color c: color) {
			System.out.println(c.name());
		}
	}
	
	enum Color{
		RED, BLUE, GREEN;
	}
}
