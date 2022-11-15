package com.shree.collection.streams;

import java.util.HashMap;
import java.util.Map;

public class StreamEmployeeMapDemo {

    public static void main(String[] args) {
        Map<Integer, Employee> employeeMap = new HashMap<>();
        employeeMap.put(1, new Employee(1,"Rohan", 60000L, "IT"));
        employeeMap.put(2, new Employee(2,"Rohit", 70000L, "CSE"));
        employeeMap.put(3, new Employee(3,"Rahul", 40000L, "CIVIL"));
        employeeMap.put(4, new Employee(4,"Rajesh", 75000L, "IT"));
        employeeMap.put(5, new Employee(5,"Sachin", 50000L, "CSE"));
        employeeMap.put(6, new Employee(6,"Viru", 85000L, "ELECTRICAL"));
        employeeMap.put(7, new Employee(7,"Saurav", 90000L, "IT"));
        employeeMap.put(8, new Employee(8,"Virat", 95000L, "CSE"));

        //first method to iterate
        employeeMap.forEach((k,v) -> System.out.println(k+":"+v));

        for(Integer i: employeeMap.keySet()){
            System.out.println(i+"-"+employeeMap.get(i));
        }

        //having salary greater than 90000
        employeeMap.keySet().stream()
                .filter(i -> employeeMap.get(i).getSalary() > 90000 )
                    .forEach( i -> System.out.println(employeeMap.get(i)));

        //name starting with character R
        employeeMap.keySet().stream()
                .filter(i -> employeeMap.get(i).getName().startsWith("R"))
                .forEach( i -> System.out.println(employeeMap.get(i)));

    }
}
