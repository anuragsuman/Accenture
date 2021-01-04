package com.job.collection;

public class StackClass {
	
	int top = -1;
	int size;
	private int arr[];
	public StackClass(int i) {
		size =i;
		arr = new int[i];
	}

	private void push(int i) {
		arr[++top] = i; 
	}
	
	public int pop() {
		return arr[top--];
	}
	
	public static void main(String[] args) {
		
		StackClass stackClass = new  StackClass(2);
		stackClass.push(10);
		stackClass.push(20);
		int a = stackClass.pop();
		System.out.println(stackClass.arr[1]);
	}


}
