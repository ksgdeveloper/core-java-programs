package com.shree.regex;
/**
 * ^[a-zA-Z]*$
 * @author shrikant
 * Get the string
 * Match the string with the Regex using matches().
 * Return true is matched
 */
public class RegexStringMatchesDemo {
	public static void main(String[] args) {
		System.out.println("GeeksForGeeeks " + isStringContainsOnlyAlphabet("GeeksForGeeeks"));
		System.out.println("Geeks4Geeeks " + isStringContainsOnlyAlphabet("Geeks4Geeeks"));
		System.out.println("ABCDefgh " + isStringContainsOnlyAlphabet("ABCDefgh"));
		System.out.println("Input Null  " + isStringContainsOnlyAlphabet(null));
		System.out.println("Input Blank  " + isStringContainsOnlyAlphabet(""));
		System.out.println();
		System.out.println("Using Lambda GeeksForGeeeks " + isStringContainsOnlyAlphabetUsingLambda("GeeksForGeeeks"));
		System.out.println("Using Lambda Geeks4Geeeks " + isStringContainsOnlyAlphabetUsingLambda("Geeks4Geeeks"));
		System.out.println("Using Lambda ABCDefgh " + isStringContainsOnlyAlphabetUsingLambda("ABCDefgh"));
		System.out.println("Using Lambda Null " + isStringContainsOnlyAlphabetUsingLambda(null));
		System.out.println("Using Lambda Blank " + isStringContainsOnlyAlphabetUsingLambda(""));
	}
	private static boolean isStringContainsOnlyAlphabet(String str) {
		return (
				(str !=null) && (!str.equals("")) && (str.matches("^[a-zA-Z]*$")) 
			   );
	}
	
	private static boolean isStringContainsOnlyAlphabetUsingLambda(String str) {
		return (
				(str !=null) && (!str.equals("")) && (str.chars().allMatch(Character::isLetter)) 
			   );
	}
}
