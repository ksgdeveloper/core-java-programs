package com.shree.java8;

import java.util.ArrayList;
import java.util.List;

public class TestStudent {
	public static void main(String[] args) {
		Student s1 = new Student("Tom", 1, 15, 90);
		Student s2 = new Student("Mary", 2, 16, 100);
		Student s3 = new Student("John", 3, 18, 35);
		Student s4 = new Student("Dave", 4, 15, 80);
		Student s5 = new Student("Tony", 5, 14, 85);
		
		List<Student> students = new ArrayList<>();
		students.add(s1);
		students.add(s2);
		students.add(s3);
		students.add(s4);
		students.add(s5);
		
		System.out.println("Total Students " + students.size());
		
		for(Student s : students) {
			System.out.println(s);
		}
		
		System.out.println("--------Using 1st method Stream -----------");
		students.stream().forEach(System.out::println);
		
		System.out.println("--------Using 2nd method Stream -----------");
		students.stream().forEach(e->System.out.print(e.getName() + ", "));
		
		System.out.println("\n--------Filter marks greater than 80 -----------");
		students.stream().filter(e-> e.getMarks()>80).forEach(e -> System.out.println(e));
		
		System.out.println("--------Highest Marks -----------");
		System.out.println(students.stream().map(e -> e.getMarks()).max(Integer::compare).get());
		
		System.out.println("--------Student Highest Marks -----------");
		students.stream().filter(e-> e.getMarks()==100).forEach(e -> System.out.println(e));
		
	}
}
