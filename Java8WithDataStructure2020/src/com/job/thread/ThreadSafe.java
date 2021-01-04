package com.job.thread;

import java.util.concurrent.atomic.AtomicInteger;

public class ThreadSafe {
	
	// When we make this method as synchronized  -> { thread safe _ locking of object } then it will be thread-safe.
	int count = 0;
	public  synchronized int increment() {
		return count++;
	}
	
	// or else we can use AtomicInteger -> { thread safe _ no locking of object }
	AtomicInteger atomicInteger = new AtomicInteger(0);
	public  int incrementA() {
		return atomicInteger.getAndIncrement();
	}

	public static void main(String[] args) throws InterruptedException {
		
		ThreadSafe t = new ThreadSafe();
		
		Thread t1 = new Thread(() -> {
			for(int i =0; i<10;i++) {
				t.incrementA();
			}
		});
		
		Thread t2 = new Thread(() -> {
			for(int i =0; i<10;i++) {
				t.incrementA();
			}
		});
		
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		
		System.out.println(t.atomicInteger);

	}

}
