package com.job.sortingAndSearching;

public class SelectionSort {

	public static void main(String[] args) {

		int arr[] = {5,2,3,7,4,1};
		
		for(int i=0; i< arr.length - 1; i++) {
			int iMin = i;
			for(int j = i+1; j < arr.length; j++) {
				if(arr[j] < arr[iMin]) {
					iMin = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[iMin];
			arr[iMin] = temp;
		}

		System.out.println("Selection Sorted Array");
		System.out.println("======================");
		for(int i :arr) {
			System.out.println(i);
		}

	}


}
