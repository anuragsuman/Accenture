package com.lti.codilityTestPreparation;

import java.util.Arrays;
import java.util.stream.IntStream;

public class PermMissingElement {

	
	
	
	/*
	 * 1). add all the number{2,3,1,5}
	 * 2). add{1 to 5} N(N+1)/2
	 * 3). substract step2-step1
	 */
	
	public static int AnuragSolution(int A[]) {
		if(A == null){
			return 0;
		}
		int sum = IntStream.of(A).sum();
		int N = A.length+1;
		int NaturalNumberAdd = (N*(N+1))/2;
		return NaturalNumberAdd-sum;
	}


	public static void main(String[] args) {
		int[] input = {2,3,1,5};
		System.out.println(AnuragSolution(input));
		int result = missingElem(input);
		System.out.println("result1--->"+result);

		result = solution(input);
		System.out.print("result11--->"+result);

	}

	static int missingElem(int[] A){ // Function to Find Missing Element
		long sum = 0; // Will Hold Sum of All Numbers from 1 to N+1
		long arraysum = 0; // Will Hold Sum of All Numbers in Array
		long missing = 0; // Will Hold Missing Value

		for (int i = 0; i < A.length; i++) {// Get Sum of All Numbers from 1 to  N+1, and Array
			sum += (i + 1);
			arraysum += A[i];
		}
		sum += A.length + 1; // Add Last Number in Range (N+1)
		missing = sum - arraysum; // Subtract Sum of Array from Sum of Range to get Missing Value
		return (int) missing; // Return Missing Value
	}

	//https://codility.com/demo/results/trainingPRHEBN-NCZ/
	static int solution(int[] data) {
		long N = data.length + 1;
		long total = (N * (N + 1)) / 2;
		long sum = 0L;
		for (int i : data) {
			sum += i;
		}
		return (int) (total - sum);
	}
	static int solution1(int[] A) {
		if(A == null){
			return 0;
		}
		long arraySum = Arrays.stream(A).asLongStream().sum();
		long N = A.length+1;
		long expectedSum = (N*(N+1))/2;
		return (int)(expectedSum-arraySum);
	}

}
