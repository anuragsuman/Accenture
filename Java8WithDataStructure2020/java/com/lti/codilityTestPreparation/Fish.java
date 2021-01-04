package com.lti.codilityTestPreparation;

import java.util.Stack;

public class Fish {

	public static int fish(int[] A, int[] B) {
		Stack<Integer> s = new Stack<Integer>();

		for(int i = 0; i < A.length; i++){
			int size  = A[i];
			int dir  = B[i];
			if(s.empty()){
				s.push(i);
			}
			else{
				while(!s.empty() && dir - B[s.peek()] == -1 && A[s.peek()] < size){
					s.pop();
				}
				if(!s.empty()){
					if(dir - B[s.peek()] != -1) s.push(i);
				}
				else{
					s.push(i);    
				}
			}
		}
		return s.size();
	}

	public static void main(String[] args) {
		int A[] = new int[]{4,3,2,1,5}; 
		int B[] = new int[]{0,1,1,1,0}; 
		System.out.println(Fish.fish(A, B));
	}

}
