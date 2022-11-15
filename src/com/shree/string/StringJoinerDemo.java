package com.shree.string;

import java.util.StringJoiner;

/**
 * Constructing sequence of character demo using a delimiter
 * Also using prefix and postfix example
 * @author shrikant
 *
 */

public class StringJoinerDemo {
	public static void main(String[] args) {
		StringJoiner joiner = new StringJoiner(",", "[", "]");
		
		joiner.add("Tom")
				.add("John").add("Matt");
		
		System.out.println(joiner.toString());
		
		//displays {Tom,John,Matt}
	}
}
