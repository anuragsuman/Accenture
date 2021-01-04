package com.job.designPattern.Adapter;

import java.util.ArrayList;

public class Adapter implements TargetAdapter{

	@Override
	public ArrayList<Employee> convertEmployeeFromArrayToArrayList(Employee[] empArray) {
	    ArrayList<Employee> empList = new ArrayList<Employee>();
		for(int i=0;i<empArray.length;i++) {
			empList.add(empArray[i]);
	    }
		return empList;
	}

	
	
}
