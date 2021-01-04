package com.lti.codilityTestPreparation;

public class MinPerimeterRectangle {

	public static void main(String[] args) {
		int number = 20;
		System.out.println(minPerimeterRectangle(number));
	}

	private static int minPerimeterRectangle(int number) {
		int division = 0;
		int s = 0;
		for(int i =2; i<= number ;i++) {
			if(number % i == 0) {
				s = i;
				division = number / i;
				if(i>division) {
					break;
				}
			}
		}
		return (division+s)*2;
	}

}
