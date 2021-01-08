package com.job.concurrency;

public class SynchronizedIssue {
	static  int count =0;
	//static volatile int count =0;
	//static AtomicInteger count = new AtomicInteger(0);
	
	public static void main(String[] args) throws InterruptedException {
		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				for(int i =0; i<10000;i++) {
			         //count.incrementAndGet();
					//class level lock is required bcz working on 2 thread object
					synchronized (SynchronizedIssue.class) {
						count++;
					}
				}
			}
		});
		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				for(int i =0; i<10000;i++) {
					//count.incrementAndGet();
					//class level lock is required bcz working on 2 thread object
					synchronized (SynchronizedIssue.class) {
						count++;
					}
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
