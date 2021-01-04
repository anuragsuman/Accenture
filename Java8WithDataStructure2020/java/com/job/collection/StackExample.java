package com.job.collection;

public class StackExample {
	
	private int top = -1;
	private int[] array = new int[2];
	
	public void push(int number) {
		top = top+1;
		array[top] =number;
	}
	
	public void pop() {
		array[top]--;
	}
	
	public static void main(String[] args) {
		
		StackExample stackExample = new StackExample();
		stackExample.push(123);
		stackExample.push(1);
		stackExample.pop();

		for(int i : stackExample.array) {
			System.out.println(i);
		}
		
	}

}
