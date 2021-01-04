package com.job.oops;

class A1{
	public static  void m1() {
		System.out.println("ClassA1_m1");
	}

}

class A2 extends A1{
	public static  void m1() {
		System.out.println("ClassA2_m1");
	}

}
public class CompileTimeExampleCalling{

	public static void main(String[] args) {
		
		A2 a22 = new A2();
		a22.m1(); // ClassA2_m1
		
		A1 a11 = new A1();
		a11.m1(); // ClassA1_m1
		
		/*
		 * Downcasting will throw the error.
		 * A2 a2 = new A2();
		 * a2.m1();
		 */
		A1 a12 = new A2();
		a12.m1();// ClassA1_m1
		
		
	}

}
