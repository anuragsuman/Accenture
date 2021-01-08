package com.job.concurrency;

import java.util.concurrent.atomic.AtomicInteger;

public class VolatileAtomicIntegerCountIssue extends Thread{
	static  int count =0;
	//static volatile int count =0;
	//static AtomicInteger count = new AtomicInteger(0);
	
	public static void main(String[] args) throws InterruptedException {
		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				for(int i =0; i<10000;i++) {
			         //count.incrementAndGet();
					count++;
				}
			}
		});
		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				for(int i =0; i<10000;i++) {
					//count.incrementAndGet();
					count++;
				}
			}
		});
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		
		System.out.println("Count is : "+count);
	}
}
