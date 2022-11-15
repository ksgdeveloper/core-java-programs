package com.shree.stream;

public class Employee {
	private Integer id;
	private String name;
	private Long salary;
	private String branch;
	
	
	public Employee(Integer id, String name, Long salary, String branch) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.branch = branch;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getSalary() {
		return salary;
	}
	public void setSalary(Long salary) {
		this.salary = salary;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", branch=" + branch + "]";
	}
	
	
}
