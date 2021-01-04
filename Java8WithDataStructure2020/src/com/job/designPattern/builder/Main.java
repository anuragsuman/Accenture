package com.job.designPattern.builder;

public class Main {

	public static void main(String[] args) {
		StudentBuilder builder = new StudentBuilder().id(0).name("anurag").salary(1000).build();
		
		System.out.println(builder.toString());
		
		StudentBuilder builder1 = new StudentBuilder().id(1).name("rohit").build();

		System.out.println(builder1.toString());
		
		//by Annotations
		
	//	BuilderByAnnotation builderByAnnotation = BuilderByAnnotation.builder().id(0).name("chacha").salary(3000).build();
		
		//System.out.println(builderByAnnotation.toString());
		
		System.out.println();
	}

}
