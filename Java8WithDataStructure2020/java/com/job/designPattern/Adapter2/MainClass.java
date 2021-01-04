package com.job.designPattern.Adapter2;

public class MainClass {

		public static void main(String args[]) {
			
			NewCustomer newCustomer = new NewCustomer();
			System.out.println(newCustomer.oldCustomerDetails());
		}
}
