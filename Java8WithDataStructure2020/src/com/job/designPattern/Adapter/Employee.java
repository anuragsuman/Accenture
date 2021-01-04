package com.job.designPattern.Adapter;

public class Employee {

	private String empName;
	private int empId;
	private String designation;

	public Employee(String empName, int empId, String designation) {
		this.empName = empName;
		this.empId = empId;
		this.designation = designation;
	}

	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}

	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", empId=" + empId + ", designation=" + designation + "]";
	}

}
