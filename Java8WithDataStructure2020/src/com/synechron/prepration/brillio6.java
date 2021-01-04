package com.synechron.prepration;
class A1111 
{
	synchronized void m1()
	{
		System.out.println("In m1 A");
	}
	void m2()
	{
		System.out.println("In m2 A");
	}
}


public class brillio6 extends Thread{
	public static void main(String args[]) {
		A1111 a = new A1111();
		//Thread t1 = new Thread(a);
		
	}
}
