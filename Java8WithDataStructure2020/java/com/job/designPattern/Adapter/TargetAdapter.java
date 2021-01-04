package com.job.designPattern.Adapter;

import java.util.ArrayList;

public interface TargetAdapter {
	
	public ArrayList<Employee> convertEmployeeFromArrayToArrayList(Employee[] empArray);

}
