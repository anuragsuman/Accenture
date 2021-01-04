package com.lti.codilityTestPreparation;

import java.util.HashMap;

public class CountNonDivisible {

	public static void main(String[] args) {
		int arr[] = new int[]{3,1,2,3,6};
		HashMap<Integer,Integer> hashMap = new HashMap<Integer, Integer>();
		for(int i = 0; i< arr.length ;i++) {
			int count =1;
			for(int j = 0; j< arr.length ;j++) {
				if(i != j && arr[j]%arr[i]==0) {
					hashMap.put(arr[i], count++);
				}else {
					hashMap.put(arr[i], 0);
				}
			}	
		}
		System.out.println(hashMap);
	}
}
