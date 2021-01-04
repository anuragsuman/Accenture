package com.lti.codilityTestPreparation;

import java.util.Arrays;

public class DeleteSelectedElementFromArray {

	public static void main(String[] args) {
		int arr[] = {1,3,2,4,5};
		
		//remove 3 from array
		int j=0;
		for(int i = 0; i< arr.length-1 ;i++) {
			if(arr[i] == 3) {
				arr[j] = 0;
			}else {
				arr[j] = arr[i];
			}
			j++;
		}

	   Arrays.stream(arr).forEach(e->System.out.println(e));
	}

}
