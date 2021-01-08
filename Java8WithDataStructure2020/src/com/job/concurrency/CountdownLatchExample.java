package com.job.concurrency;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CountdownLatchExample implements Runnable {
	
	private CountDownLatch latch;
	
	public CountdownLatchExample(CountDownLatch latch) {
		this.latch = latch;
	}
	
	public void run() {
		System.out.println("Starting :");
		try {
			Thread.sleep(3000);
			System.out.println(Thread.currentThread());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		latch.countDown();
		System.out.println("Completed :");
	}
	
	public static void main(String[] args) throws InterruptedException, BrokenBarrierException {
		/*        
		 * A CountDownLatch is a versatile synchronization tool and can be used for a number of purposes. 
		 * A CountDownLatch is initialized with a given count. The await methods block until the current 
		 * count reaches zero due to invocations of the countDown method, 
		 * after which all waiting threads are released and any subsequent invocations of await return immediately. 
		 * This is a one-shot phenomenon -- the count cannot be reset. If you need a version that resets the count, consider using a CyclicBarrier. 
		 */
		CountDownLatch latch = new CountDownLatch(3);
		
		ExecutorService executor = Executors.newFixedThreadPool(3);
		
		for(int i =0; i<3 ;i++) {
			executor.submit(new CountdownLatchExample(latch));
		}
		//Causes the current thread to wait until the latch has counted down to zero, unless the thread is interrupted. 
		latch.await();
		
		System.out.println("All thread completed.......");
		
	}


}
