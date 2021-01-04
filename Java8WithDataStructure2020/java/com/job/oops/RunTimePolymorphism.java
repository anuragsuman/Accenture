package com.job.oops;

class ABC{
	// Polymorphism(overriden method) that is resolved during run time is known as runtime polymorphism. 
	
	public void myMethod(){
		System.out.println("Overridden Method");
	}
}

public class RunTimePolymorphism {
	
	public void myMethod(){
		System.out.println("Overridden Method");
	}

	public static void main(String[] args) {
		RunTimePolymorphism runTimePolymorphism = new RunTimePolymorphism();
		runTimePolymorphism.myMethod();
	}

}
