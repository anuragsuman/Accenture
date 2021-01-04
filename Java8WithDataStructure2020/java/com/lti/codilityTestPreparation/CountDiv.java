package com.lti.codilityTestPreparation;

public class CountDiv {
	
	 public static int solution(int A, int B, int K) {
		 if(A>B) {
			 return 0;
		 }
		 int count =0;
		 for(int i = A; i<=B;i++) {
			 if(i % 2 == 0) {
				 count++;
			 }
		 }
		 return count;
	 }

	public static void main(String[] args) {
		
		System.out.println(solution(3,7,3));
	}

}
