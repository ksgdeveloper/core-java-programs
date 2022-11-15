package com.shree.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexNumberMatchDemo {
	public static void main(String[] args) {
		String str1 = "1234";
		String str2 = "";
		String str3 = "1234b";
		String str4 = "1234#";
		
		Pattern p = Pattern.compile("[0-9]+");
		Matcher m = p.matcher(str1);
		
		System.out.println("matching result " + p.matcher(str1).matches() + " " + str1.matches("[0-9]+"));
		System.out.println("matching result " + p.matcher(str2).matches() + " " + str2.matches("[0-9]+"));
		System.out.println("matching result " + p.matcher(str3).matches() + " " + str3.matches("[0-9]+"));
		System.out.println("matching result " + p.matcher(str4).matches() + " " + str4.matches("[0-9]+"));
	}
}
