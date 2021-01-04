package com.lti.codilityTestPreparation;

public class AllOddOccuranceInArray {

	public static void main(String[] args) {
		int arr[] = new int[]{ 2, 3, 5, 4, 5, 2, 3, 5, 2, 4, 4, 2 }; 

		System.out.println(getOddOccurrence(arr));
	}

	private static int getOddOccurrence(int[] arr) {
		for(int i =0; i< arr.length ; i++ ) {
			int count = 0;
			for(int j =0; j< arr.length ; j++ ) {
				if(arr[i] == arr[j]) {
					count++;
				}
			}
			if(count % 2 != 0) {
				return arr[i];
			}
		}
		return -1;
	}
}
