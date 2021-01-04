package com.synechron.prepration;
//JAVA code to explain overcome  
//cloning issue with singleton 
class SuperClass implements Cloneable { 
	@Override
	protected Object clone() throws CloneNotSupportedException  { 
		return super.clone();
	} 
} 
//Singleton class 
class Singleton2 extends SuperClass { 
	// public instance initialized when loading the class 
	public static Singleton2 instance = new Singleton2(); 

	private Singleton2() { 
		// private constructor 
	} 
	@Override
	protected Object clone() throws CloneNotSupportedException  { 
		//throw  new CloneNotSupportedException();
		return instance;
	} 
	
}
public class BreakSingletonUsingClonnableSaveUsingSuperCloneMethod {
	public static void main(String[] args) throws CloneNotSupportedException  { 
		Singleton2 instance1 = Singleton2.instance; 
		Singleton2 instance2 = (Singleton2) instance1.clone(); 
		System.out.println("instance1 hashCode:- " + instance1.hashCode()); 
		System.out.println("instance2 hashCode:- " + instance2.hashCode());  
	} 
}
