package com.lti.codilityTestPreparation;

import java.util.Arrays;

public class Triangle {

	public static void main(String[] args) {
		int A[] = new int[]{
				10,2,5,
				1,7
		}; 
		System.out.println(new Triangle().solution(A,A.length));

	}

	public int solution(int[] arr, int N){ // If number of elements are  
		// less than 3, then no  
		// triangle is possible 
		if (N < 3) 
			return 0; 

		// first sort the array 
		Arrays.sort(arr); 

		// loop for all 3  
		// consecutive triplets 
		for (int i = 0; i < N - 2; i++) 

			// If triplet satisfies  
			// triangle condition, break 
			if (arr[i] + arr[i + 1] > arr[i + 2]) 
				return 1; 

		return 0;
	}

}
