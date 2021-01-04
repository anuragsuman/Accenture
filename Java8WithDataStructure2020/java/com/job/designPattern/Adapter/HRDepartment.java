package com.job.designPattern.Adapter;

public class HRDepartment {
	
	public Employee[] getEmployees() {
		
		Employee[] employee = new Employee[3];
		Employee e1 = new Employee("anurag",1,"SE");
		Employee e2 = new Employee("rohit",2,"SSE");
		Employee e3 = new Employee("siva",3,"LEAD");
		
		employee[0] = e1;
		employee[1] = e2;
		employee[2] = e3;
		
		return employee;
	}
}
