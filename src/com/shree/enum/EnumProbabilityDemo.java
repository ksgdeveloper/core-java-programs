package com.shree;

import java.util.Random;

public class EnumProbabilityDemo {
	public static void main(String[] args) {
		int max = 10;
        int min = 1;
        int range = max - min + 1;
        System.out.println(Math.random());
        for (int i = 0; i < 10; i++) {
            int rand = (int)(Math.random() * range) + min;
  
            // Output is different everytime this code is executed
            System.out.println(rand);
        }	}
}

enum Answers{
	NO, YES, LATER, MAYBE, SOON, NEVER;
}
