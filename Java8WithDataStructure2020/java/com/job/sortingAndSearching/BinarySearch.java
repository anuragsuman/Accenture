package com.job.sortingAndSearching;

public class BinarySearch {

	private static int searchBinary(int[] arr, int start, int length, int searchElement) {
		if(length >= start ){
			int mid = (start + length)/ 2;
			if(arr[mid] == searchElement) {
				return mid;
			}else if(arr[mid] < searchElement) {
				return searchBinary(arr, mid+1, length, searchElement);
			}else {
				return searchBinary(arr, start, mid-1, searchElement);
			}
		}
		return -1;
	}

	
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,7};

		int searchElement = 5;
		
		int resultPosition = searchBinary(arr,0,arr.length-1,searchElement);
				
		if(resultPosition == -1) {
			System.out.println("Not present in the array");
		}else {
			System.out.println("Present in the array");
		}

	}

}
