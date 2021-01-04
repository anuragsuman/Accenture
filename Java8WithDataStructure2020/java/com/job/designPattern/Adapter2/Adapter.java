package com.job.designPattern.Adapter2;

public class Adapter implements CustomerInterface{
	
	LegacyCustomer LegacyCustomer;
	
	public String getCustomerInfoFromAdapter() {
		LegacyCustomer = new LegacyCustomer();
		return LegacyCustomer.getCustomerInfo();
	}

}
