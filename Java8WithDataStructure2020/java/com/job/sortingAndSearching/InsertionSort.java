package com.job.sortingAndSearching;

public class InsertionSort {

	public static void main(String[] args) {

		int arr[] = {5,2,3,7,4,1};
		
		int key, j;
		for (int i =0; i<arr.length;i++) {
			key = arr[i];
			j = i-1;
			while(j>=0 && arr[j] > key) {
				arr[j+1] = arr[j];
				j =j-1;
			}
			arr[j+1] = key;
		}

		System.out.println("Insertion Sorted Array");
		System.out.println("======================");
		for(int i :arr) {
			System.out.println(i);
		}

	}


}
