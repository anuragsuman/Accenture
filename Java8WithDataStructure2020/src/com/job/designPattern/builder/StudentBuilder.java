package com.job.designPattern.builder;

public class StudentBuilder {
	
	private int id;
	private String name;
	private double salary;
	
	
	public StudentBuilder id(int id) {
		this.id = id;
		return this;
	}
	public StudentBuilder name(String name) {
		this.name = name;
		return this;
	}
	public StudentBuilder salary(double salary) {
		this.salary = salary;
		return this;
	}
	
	public StudentBuilder build() {
		return this;
	}
	@Override
	public String toString() {
		return "StudentBuilder [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
	

}
