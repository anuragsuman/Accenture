package com.job.oops;


class A{
	// Polymorphism(override method) that is resolved during compiler time is known as static polymorphism. 
	//Method overloading is an example of compile time polymorphism.
	public void m1() {
		System.out.println("m1");
	}
	
	public void m1(int x) {
		System.out.println("m1_x");
	}
	
}


public class CompileTimePolymorphism {

	public static void main(String[] args) {
		A a = new A();
		a.m1();
		
	}

}
