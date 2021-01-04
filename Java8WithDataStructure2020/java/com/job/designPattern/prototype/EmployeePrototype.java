package com.job.designPattern.prototype;

import java.util.List;

public class EmployeePrototype {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		Employee employee = new Employee();
		List<Employee> empList = employee.getAllEmployees();
		
		empList.stream().forEach((e)->System.out.println("Add the object : " +e.getEmpId()+"__"+e.getEmpname()));
		
		List<Employee> updatedEmp = employee.clone();
		employee.setEmpId(103);
		employee.setEmpname("Chacha");
		updatedEmp.add(employee);
		
		updatedEmp.stream().forEach((e)->System.out.println("Clone the Object and Add some more row :"+e.getEmpId()+"__"+e.getEmpname()));
		
	}

}
