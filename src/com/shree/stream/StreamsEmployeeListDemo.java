package com.shree.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsEmployeeListDemo {

	public static void main(String[] args) {

		List<Employee> employeeList = new ArrayList<>();
		employeeList.add(new Employee(1,"Rohan", 60000L, "IT"));
		employeeList.add(new Employee(2,"Rohit", 70000L, "CSE"));
		employeeList.add(new Employee(3,"Rahul", 40000L, "CIVIL"));
		employeeList.add(new Employee(4,"Rajesh", 75000L, "IT"));
		employeeList.add(new Employee(5,"Sachin", 50000L, "CSE"));
		employeeList.add(new Employee(6,"Viru", 85000L, "ELECTRICAL"));
		employeeList.add(new Employee(7,"Saurav", 90000L, "IT"));
		employeeList.add(new Employee(8,"Virat", 95000L, "CSE"));
		
		//List Employess based on their salaries ascending for branch IT
		System.out.println("List Employess based on their name ascending for all branch=====");
		employeeList.stream()
			.sorted(Comparator.comparing(Employee::getBranch ))
					.forEach(System.out::println);
		
		//List Employess based on their salaries descending for branch IT
		System.out.println("List Employess based on their salaries descending for branch IT=====");
		employeeList.stream()
			.sorted((o1,o2) -> o2.getSalary().intValue()-o1.getSalary().intValue())
				.filter(e -> e.getBranch().equals("IT"))
				.forEach(System.out::println);
		
		//List Employess based on their salaries ascending for branch IT
		System.out.println("List Employess based on their salaries ascending for branch CSE=====");
		employeeList.stream()
			.sorted(new EmployeeComparator())
				.filter(e -> e.getBranch().equals("CSE"))
					.forEach(System.out::println);
		
		
		List<Employee> taxList = employeeList.stream().filter(emp->emp.getSalary() > 70000).collect(Collectors.toList());
		System.out.println("Taxable Employees in descending order");
		taxList.stream()
				.sorted((o1,o2) -> o2.getSalary().intValue()-o1.getSalary().intValue())
					.filter(e -> e.getBranch().equals("IT"))
						.forEach(System.out::println);
		
		List<Employee> taxNoList = employeeList
										.stream()
											.filter(emp->emp.getSalary() <= 70000)
													.collect(Collectors.toList());
		System.out.println(taxNoList);
	}
}

class EmployeeComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.getSalary().intValue() - o2.getSalary().intValue();
	}
	
}
