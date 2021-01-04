package com.job.interview;

import java.util.HashMap;
import java.util.Scanner;

public class reverseArrayInStringWhereDigitIsAFromCMD {

	static String[] arr;
	
	HashMap<String,Integer> hashmap = new HashMap<String,Integer>();

	private void reverseNumber(String[] arr2) {
		for(int i = 0;i<arr2.length; i++) {
			char[] c = arr2[i].toCharArray();
			hashmap.put(arr2[i],0);
			for(int j =0; j<c.length ;j++) {
				if(c[j] == 'a') {
					hashmap.put(arr2[i],hashmap.get(arr2[i])+1);
				}
			}
		}
	}

	public static void main(String[] args) {
		reverseArrayInStringWhereDigitIsAFromCMD reverseObj = new reverseArrayInStringWhereDigitIsAFromCMD();
		
		Scanner scn = new Scanner(System.in); 
		System.out.println("Enter the number of Digit.....");
		int number = scn.nextInt();
		arr = new String[number];
		System.out.println("Enter the Digit");
		for (int i =0; i< number ; i++) {
			arr[i] = scn.next();
		}
		reverseObj.reverseNumber(arr);
		
		System.out.println(reverseObj.hashmap);
	}

}
