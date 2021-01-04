package com.job.thread;

public class NotThreadSafe {

	// Not a thread-safe.
	int count = 0;
	public  int increment() {
		return count++;
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		NotThreadSafe t = new NotThreadSafe();
		
		Thread t1 = new Thread(() -> {
			for(int i =0; i<10;i++) {
				t.increment();
			}
		});
		
		Thread t2 = new Thread(() -> {
			for(int i =0; i<10;i++) {
				t.increment();
			}
		});
		
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		
		System.out.println(t.count);

	}

}

