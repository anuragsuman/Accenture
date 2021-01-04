package com.lti.codilityTestPreparation;

public class RotationOfArrayOnKTimes {
	
	/*
	 *   For loop {
	 *             a).Find out the last element
	 *             b).STEP 1.1: set all the element in reverse in another loop
	 *             c).set last element on 0 index
	 *   END LOOP
	 */

	public static int[] rotationOnKTimes(int arr[] , int Ktimes) {
		//write your code
		for(int i = 0; i < Ktimes; i++){    
			int last = arr[arr.length-1];    
			for(int j = arr.length-1; j > 0; j--){    
				arr[j] = arr[j-1];    // 4 2 3 1 5 -- opposite
			}    
			arr[0] = last;    
		}    
		return arr;
	}

	public static void main(String[] args) {
		int arr[] = {1,3,2,4,5};
		//output -- 5 1 3 2 4  : 1 rotation
		//output -- 4 5 1 3 2  : 2 rotation
		int tempArr[] = RotationOfArrayOnKTimes.rotationOnKTimes(arr, 2);

		for(int tempData: tempArr) {
			System.out.println(tempData);
		}

	}

}
