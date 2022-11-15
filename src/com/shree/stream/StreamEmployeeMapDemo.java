package com.shree.stream;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class StreamEmployeeMapDemo {

	public static void main(String[] args) {

		Map<Integer, Employee> map = new HashMap<>();
		map.put(1, new Employee(1,"Rohan", 60000L, "IT"));
		map.put(2, new Employee(2,"Rohit", 70000L, "CSE"));
		map.put(3, new Employee(3,"Rahul", 40000L, "CIVIL"));
		map.put(4, new Employee(4,"Rajesh", 75000L, "IT"));
		map.put(5, new Employee(5,"Sachin", 50000L, "CSE"));
		map.put(6, new Employee(6,"Viru", 85000L, "ELECTRICAL"));
		map.put(7, new Employee(7,"Saurav", 90000L, "IT"));
		map.put(8, new Employee(8,"Virat", 95000L, "CSE"));
		
		//first method
		map.forEach((k,v) -> System.out.println(k+"-"+v));
		
		//second method
		for(Integer i : map.keySet()) 
			System.out.println(i+"="+map.get(i));
		
		//third method
		System.out.println("Third Method");
		map.entrySet()
				.stream()
					.sorted(Map.Entry.comparingByValue(Comparator.comparing(Employee::getSalary)))
						.forEach(e -> System.out.println(e));
		
		//third method
		System.out.println("Third Method");
		map.entrySet()
				.stream()
					.sorted(Map.Entry.comparingByValue(Comparator.comparing(Employee::getSalary).reversed()))
						.forEach(System.out::println);
		
		//fourth method
		System.out.println("Fourth Method");
		map.entrySet()
				.stream()
					.sorted(Map.Entry.comparingByValue((o1,o2)-> o1.getSalary().intValue() -o2.getSalary().intValue()))
						.forEach(System.out::println);
		
		//fifth method
		System.out.println("Fifth Method");
		Iterator<Map.Entry<Integer,Employee>> itr = map.entrySet().iterator();
		while(itr.hasNext()) {
			Map.Entry<Integer, Employee> theEmployee = itr.next();
			System.out.println(theEmployee.getKey()+" "+theEmployee.getValue());
		}
		
	}

}
