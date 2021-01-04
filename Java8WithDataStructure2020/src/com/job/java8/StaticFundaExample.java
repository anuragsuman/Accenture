package com.job.java8;

public class StaticFundaExample {

	static int temp = 0;
	// without static -->  0 0 0 .......with static --> 0 1 2
	
	public void display() {
		System.out.println(temp++);
	}
	
	public static void main(String[] args) {

		StaticFundaExample staticFundaExample = new StaticFundaExample();
		staticFundaExample.display();  
		
		StaticFundaExample staticFundaExample1 = new StaticFundaExample();
		staticFundaExample1.display();
		
		StaticFundaExample staticFundaExample2 = new StaticFundaExample();
		staticFundaExample2.display();
		
		
	}

}
