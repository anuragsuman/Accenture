package com.job.interview;

public class ArmStrong {

	public static void main(String[] args) {
		int sum =0;
		int number = 153;
		int c;
		int temp = number;
		while(temp>0) {
			c  = temp%10;
			sum = sum+(c*c*c);
			temp = temp/10;
		}

		System.out.println(sum);

	}

}
