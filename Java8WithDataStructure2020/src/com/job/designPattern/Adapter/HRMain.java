package com.job.designPattern.Adapter;

import java.util.ArrayList;

public class HRMain {

	public static void main(String[] args) {
		
		//https://www.youtube.com/watch?v=TMFJ1Zy2sDc
		
		HRDepartment hrDepartment = new HRDepartment();
		Employee[] employees = hrDepartment.getEmployees();
		
		TargetAdapter adapter = new Adapter();
		
		//adapter -> 
		ArrayList<Employee> convertEmployeeFromArrayToArrayList = adapter.convertEmployeeFromArrayToArrayList(employees);
		
		convertEmployeeFromArrayToArrayList.forEach((e)->System.out.println(e.getEmpId()+"_"+e.getEmpName()));

	}

}
