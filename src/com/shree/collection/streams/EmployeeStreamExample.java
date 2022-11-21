package com.shree.collection.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class EmployeeStreamExample {
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
        //this statement doubles the salary
        //employeeList.stream().forEach(employee -> employee.setSalary(employee.getSalary()*2l));
        System.out.println(employeeList);
        //get the employee by their ids
        Integer[] empIds = {1,3,5,6};
        Stream.of(empIds).map(employeeList::get).forEach(System.out::println);

        //filter all employees where salary is greater than 80k
        employeeList.stream().filter(e->e!=null).filter(e ->e.getSalary() > 80000).forEach(System.out::println);

        //find with highest salary
        Optional<Employee> employee = employeeList.stream()
                .sorted(Comparator.comparing(Employee::getSalary).reversed()).findFirst();
        System.out.println("Employee with highest salary " + employee.get());
    }
}
