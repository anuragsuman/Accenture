package com.job.java8;

class First{
	public void display(String msg) throws InterruptedException {
		System.out.print("["+ msg);
		Thread.sleep(2000);
		System.out.println("]");
	}
}

class Second extends Thread{
	String msg;
	First first;
	public Second(First firstP , String msgP) {
		first =  firstP;
		msg   =  msgP;
		start();
	}
	public void run() {
		try {
			first.display(msg);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
public class SynchronizationExample {
	public static void main(String[] args) {
		First f = new First();
		Second s = new Second(f, "Welcome");
		Second s1 = new Second(f, "New");
	}
}
