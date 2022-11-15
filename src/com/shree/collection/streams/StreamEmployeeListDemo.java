package com.shree.collection.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StreamEmployeeListDemo {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add( new Employee(1,"Rohan", 60000L, "IT"));
        employeeList.add( new Employee(2,"Rohit", 70000L, "CSE"));
        employeeList.add( new Employee(3,"Rahul", 40000L, "CIVIL"));
        employeeList.add( new Employee(4,"Rajesh", 75000L, "IT"));
        employeeList.add( new Employee(5,"Sachin", 50000L, "CSE"));
        employeeList.add( new Employee(6,"Viru", 85000L, "ELECTRICAL"));
        employeeList.add( new Employee(7,"Saurav", 90000L, "IT"));
        employeeList.add( new Employee(8,"Virat", 95000L, "CSE"));

        System.out.println("***** Filtering Employees for IT and sorting salary by descending order");
        employeeList.stream().filter(e -> e.getBranch().equals("IT") )
                .sorted(Comparator.comparing(Employee::getSalary).reversed()).forEach(System.out::println);

        System.out.println("***** IT employees having highest Salary");
        employeeList.stream().filter(e -> e.getBranch().equals("IT"))
                .sorted(Comparator.comparing(Employee::getSalary).reversed())
                .findFirst().ifPresent(System.out::println);

    }
}
