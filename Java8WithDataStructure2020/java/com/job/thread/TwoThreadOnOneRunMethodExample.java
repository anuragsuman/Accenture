package com.job.thread;


public class TwoThreadOnOneRunMethodExample  extends Thread{
	
	public void m1() {
		System.out.println(Thread.currentThread().getName());
	}
	
	public void run() {
		m1();
	}

	public static void main(String[] args) {
		TwoThreadOnOneRunMethodExample t1 = new TwoThreadOnOneRunMethodExample();
		t1.start();
		t1.start();
		TwoThreadOnOneRunMethodExample t2 = new TwoThreadOnOneRunMethodExample();
		t2.start();
		
		System.out.println(Thread.currentThread().getName());
	}

}
