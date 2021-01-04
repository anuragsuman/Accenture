package com.job.oops;

class A11{
	public static  void m1() {
		System.out.println("ClassA11_m1");
	}

}

public class CompileTimeExampleCalling2 extends A11{
	
	public static  void m1() {
		System.out.println("CompileTimeExampleCalling2_m1");
	}

	public static void main(String[] args) {
		
		CompileTimeExampleCalling2 compileTimeExampleCalling2 = new CompileTimeExampleCalling2();
		compileTimeExampleCalling2.m1(); // CompileTimeExampleCalling2_m1
		
		A11 a11 = new CompileTimeExampleCalling2();
		a11.m1(); // ClassA11_m1 
		
		
		// compiletime polymorphosim always work based on reference type.
		
	}

}
