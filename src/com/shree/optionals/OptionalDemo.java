package com.shree.optionals;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class OptionalDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		showDemo();
	}

	private static void showDemo() {
		List<String> str = new ArrayList<>();
		String list[] = new String[10];
		Optional<String> checkNull = Optional.ofNullable(list[4]);
		if(checkNull.isPresent()) {
			System.out.println("Not null");
		}else {
			System.out.println("No values present");
		}
		
	}

}
