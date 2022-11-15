package hackerrank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		Object obj = new Student();
		if(obj instanceof Rockstar) {
			System.out.println("Instance of Student Class");
		}else {
			System.out.println("Not an instance");
		}
		String A = "madam";
		String B = "adamm";
		List<Character> charsA = new ArrayList<>();
		for(char ch : A.toLowerCase().toCharArray()) {
			charsA.add(ch);
		}
		List<Character> charsB = new ArrayList<>();
		for(char ch : B.toLowerCase().toCharArray()) {
			charsB.add(ch);
		}
		Collections.sort(charsA);
		Collections.sort(charsB);
		
		System.out.println(charsA + " " + charsB);
		System.out.println(charsA.equals(charsB));
	}

}

class Student{}
class Rockstar{}
class Hacker{}



