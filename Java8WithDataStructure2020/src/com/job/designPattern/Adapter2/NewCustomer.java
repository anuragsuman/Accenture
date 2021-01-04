package com.job.designPattern.Adapter2;

public class NewCustomer {
	
	CustomerInterface newCustomerInterface;
	
	public String oldCustomerDetails() {
		newCustomerInterface = new Adapter();
		return newCustomerInterface.getCustomerInfoFromAdapter();
	}
	
}
