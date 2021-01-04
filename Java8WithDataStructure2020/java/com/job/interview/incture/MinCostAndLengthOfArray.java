package com.job.interview.incture;

public class MinCostAndLengthOfArray {
	
	static int [] pipes = {4,3,2,6};
	   //2 ,3 ,4 ,6 = 
	//	max length = 15
	//	min cost = 29  [10+13+15] = 38
                        // 5+9+15 = 29
	
	public static int[] binarySort(int[] arr) {
		int temp;
		for(int i=arr.length-1; i>=0 ;i--) {
			for(int j=arr.length-2; j>=0 ;j--) {
				//swap 
				if(arr[j] > arr[j+1]) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		return arr;
	}
	  //2 ,3 ,4 ,6 = 
		//	max length = 15
		//	min cost = 29  [10+13+15] = 38
	                        // 5+9+15 = 29
	public static int minCost(int[] mist) {
		int temp = 0;
		int prev =0;
		for(int i=0; i<=mist.length-1;i++) {
			  
			  temp = temp + mist[i];
			  if(i !=0) {
				  prev = prev+temp;
			  }
			  
		}
		return prev;
		
	}
	public static void main(String[] args) {
		
		
		int[] sortedArray = MinCostAndLengthOfArray.binarySort(pipes);
		
		for(int s: sortedArray) {
			System.out.println(s);
		}

		System.out.println("MinCost = "+MinCostAndLengthOfArray.minCost(sortedArray));
		
	}

}
