package com.job.thread;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicIntegerSlowerThanSynchronized {

	/*
	 * If you set THREAD_NUM to a much lower number such as 8 or 4, 
	 * you will find that your AtomicCounter is a bit faster that SynchronizedCounter. 
	 * Running with 1000 threads will cost two much CPU on AtomicInteger's CAS (compare-and-swap),
	 *  which cause it runs slower than synchronized code block.
	 */

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
		long start = System.currentTimeMillis();

		ThreadSafe t = new ThreadSafe();

		Thread t1 = new Thread(() -> {
			for(int i =0; i<1000;i++) {
				t.incrementA();
			}
		});

		Thread t2 = new Thread(() -> {
			for(int i =0; i<1000;i++) {
				t.incrementA();
			}
		});

		t1.start();
		t2.start();
		t1.join();
		t2.join();

		System.out.println(t.atomicInteger);

		long end = System.currentTimeMillis();

		System.out.println(end-start);

	}

}