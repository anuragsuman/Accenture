package com.job.designPattern.prototype;

import java.util.ArrayList;
import java.util.List;

public class Employee {
	
	static List<Employee> empList = new ArrayList();
	
	private int empId;
	private String empname;
	
	static {
		Employee employee1 = new Employee();
		employee1.setEmpId(101);
		employee1.setEmpname("Anurag");
		
		Employee employee2 = new Employee();
		employee2.setEmpId(102);
		employee2.setEmpname("Rohit");
		
		empList.add(employee1);
		empList.add(employee2);
	}
	
	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empname=" + empname + "]";
	}
	
	public List<Employee> getAllEmployees(){
		return empList;
	}
	
	@Override
	public List<Employee> clone() throws CloneNotSupportedException{
		List<Employee> dummyEmployeeList = new ArrayList<>();
		for(Employee employee : empList) {
			dummyEmployeeList.add(employee);
		}
		return dummyEmployeeList;
	}
	
}
