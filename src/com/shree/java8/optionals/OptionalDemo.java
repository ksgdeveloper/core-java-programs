package com.shree.java8.optionals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalDemo {

	public static void main(String[] args) {
		showDemo();
	}

	private static void showDemo() {
		Customer customer = new Customer(1, "Customer", null, 40);

		Optional<String> emailOptional = Optional.ofNullable(customer.getEmail());

		if(emailOptional.isPresent()) {
			System.out.println("Not null");
		}else {
			System.out.println("No values present");
		}

		System.out.println(emailOptional);
	}

}

class Customer{
	public Customer() {
	}

	public Customer(int id, String username, String email, int age) {
		this.id = id;
		this.username = username;
		this.email = email;
		this.age = age;
	}

	private int id;
	private String username;
	private String email;
	private int age;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}