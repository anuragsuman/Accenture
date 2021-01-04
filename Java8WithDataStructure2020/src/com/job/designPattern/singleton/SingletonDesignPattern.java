package com.job.designPattern.singleton;

class Singleton{
	private static Singleton singleton = null;
	
	private Singleton() {
		
	}
	
	public static Singleton  getSingletonObject() {
		if(singleton == null) {
			synchronized (Singleton.class) {
				if(singleton == null) {
					return singleton = new Singleton();
				}
			}
		}
		return null;
	}
	
	
}


public class SingletonDesignPattern {
	
	public static void main(String[] args) {

		Singleton singleton = Singleton.getSingletonObject();
		System.out.println(singleton.hashCode());
		
	}

}
