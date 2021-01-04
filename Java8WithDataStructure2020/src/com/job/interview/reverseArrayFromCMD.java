package com.job.interview;

import java.util.Scanner;

public class reverseArrayFromCMD {

	static int[] arr;

	private static void reverseNumber(int[] arr2) {
		for(int i = arr2.length-1;i>=0; i--) {
			System.out.println(arr2[i]);
		}
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in); 
		System.out.println("Enter the number of Digit.....");
		int number = scn.nextInt();
		arr = new int[number];
		System.out.println("Enter the Digit");
		for (int i =0; i< number ; i++) {
			arr[i] = scn.nextInt();
		}
		reverseNumber(arr);
	}

}
