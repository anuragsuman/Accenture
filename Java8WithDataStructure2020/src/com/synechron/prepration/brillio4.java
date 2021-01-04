package com.synechron.prepration;
class AB
{
	void m1()
	{
		System.out.println("In m1 A");
	}
}
class B extends AB
{
	void m1()
	{
		System.out.println("In m1 B");
	}
	void m2()
	{
		System.out.println("In m2 B");
	}
}

public class brillio4 {
 
	public static void main(String[] args) {
		AB a=new B();
		//a.m2();
	}
}
