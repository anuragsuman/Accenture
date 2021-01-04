package com.job.interview;

import java.util.Arrays;

public class RemoveDuplicateFromArray {

	public static void main(String[] args) {
		
		int arr[] = {1,1,2,2,2,3,3,4,4,4,5};
		
		int j=0;
		for(int i=0; i<=arr.length-2; i++) {
			if(arr[i] != arr[i+1]) {
				arr[j] = arr[i];
				j++;
			}
			arr[j]=arr[arr.length-1];
			
		}
		j++;
		while(j<arr.length) {
			arr[j]=0;
			j++;
		}
		
		Arrays.stream(arr).boxed().forEach((e)->System.out.println(e));
		
	}

}
