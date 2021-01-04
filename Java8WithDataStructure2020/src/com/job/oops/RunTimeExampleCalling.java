package com.job.oops;

class A111{
	public void m1() {
		System.out.println("ClassA1_m1");
	}

}

class A222 extends A111{
	public void m1() {
		System.out.println("ClassA2_m1");
	}

}
public class RunTimeExampleCalling{

	public static void main(String[] args) {
		
		A222 a222 = new A222();
		a222.m1(); // ClassA2_m1
		
		A111 a111 = new A111();
		a111.m1(); // ClassA1_m1
		
		A111 a111222 = new A222();
		a111222.m1();// ClassA2_m1
		
		
	}

}
