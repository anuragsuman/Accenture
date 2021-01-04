package com.lti.codilityTestPreparation;

import java.util.stream.IntStream;

public class PermutationCheck {
	
	 public static int solution(int[] A) {
	        boolean[] used = new boolean[A.length];
	        for (int number : A) {
	            if (number < 1 || number > A.length || used[number - 1]) {
	                return 0;
	            }
	            used[number - 1] = true;
	        }
	        return 1;
	    }
	 
	 public static int solution1(int[] A) {
	       int sum = IntStream.of(A).sum();
	       int N = 0;
	       for(int i : A) {
	    	   if(i>N) {
	    		   N = i;
	    	   }
	       }
	       int NatuSum = N*(N+1)/2;
	       if((NatuSum-sum) == 0) {
	    	   return 1;
	       }
	        return 0;
	    }

	public static void main(String[] args) {
		int A[] = {4,1,3,2,5,6};
		System.out.print(PermutationCheck.solution1(A));
	}

}
