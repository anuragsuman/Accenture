package com.lti.codilityTestPreparation;

public class CountFactor {

	public static void main(String[] args) {
		int number = 24;
	    int count = 0;	
		for(int i = 2; i<number ; i++) {
	        if(number%i == 0) {
	        	count++;
	        }
		}
		System.out.println(count);
	}

}
