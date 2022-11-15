package com.shree.java8;

public class Student {
	private String name;
	private int rollNum;
	private int age;
	private int marks;
	public Student(String name, int rollNum, int age, int marks) {
		this.name = name;
		this.rollNum = rollNum;
		this.age = age;
		this.marks = marks;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollNum() {
		return rollNum;
	}
	public void setRollNum(int rollNum) {
		this.rollNum = rollNum;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", rollNum=" + rollNum + ", age=" + age + ", marks=" + marks + "]";
	}
	
}
