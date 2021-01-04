package com.job.designPattern.objectPool;

public class Main {
	
	public static void main(String ars[]) {
		
		
		//SingleObject singleObject = new SingleObject();
		
		
		SingleObject singleObject = SingleObject.getInstance();
		
		System.out.println(singleObject.showMessage() + singleObject.hashCode());
		
		SingleObject singleObject1 = SingleObject.getInstance();
		
		System.out.println(singleObject1.showMessage() + singleObject1.hashCode());
		
		//singleton1.release();
		
		SingleObject singleObject2 = SingleObject.getInstance();
		//singleton2.lock();
		
		System.out.println(singleObject2.showMessage() + singleObject2.hashCode());
		
		
		
	}

}
