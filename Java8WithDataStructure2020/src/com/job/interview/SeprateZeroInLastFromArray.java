package com.job.interview;

import java.util.Arrays;

public class SeprateZeroInLastFromArray {

	public static void main(String[] args) {
		int arr[] = {1,0,2,3,0,0,4,0,5};
		
		int j=0;
		for(int i=0;i<=arr.length-1;i++) {
			if(arr[i] != 0) {
				arr[j] =arr[i];
				j++;
			}
		}
		while(j<=arr.length-1) {
			arr[j]=0;
			j++;
		}
		
		Arrays.stream(arr).boxed().forEach((e)->System.out.println(e));
		
	}

}
