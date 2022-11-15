package com.shree.collection.stack;

import java.util.Stack;

/*
 * Last In First Out*
 */
public class StackDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> stacks = new Stack<>();
		stacks.push("Welcome");
        stacks.push("To");
		stacks.push("Geeks");
		stacks.push("for");
		stacks.push("Geeks");
		System.out.println("Stack at top ");
		
		System.out.println(stacks.peek());
		System.out.println(stacks.search("Geeksss"));
		
		System.out.println(stacks.size());
		stacks.push("Geeks");
		
		stacks.stream().forEach(s -> System.out.print(s+","));
		System.out.println("\n"+stacks.peek());
		System.out.println(stacks.search("Geeks"));
		
	}

}
