package com.job.concurrency;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CyclicBarrierExample implements Runnable{
	
	private CyclicBarrier cyclicBarrier;
	
	public CyclicBarrierExample(CyclicBarrier cyclicBarrier) {
		this.cyclicBarrier = cyclicBarrier;
	}
	
	public void run() {
		System.out.println("Starting :");
		try {
			Thread.sleep(3000);
			System.out.println(Thread.currentThread());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Completed :");
	}
	
	public static void main(String[] args) throws InterruptedException, BrokenBarrierException {
		
		CyclicBarrier cyclicBarrier = new CyclicBarrier(3);
		ExecutorService executor = Executors.newFixedThreadPool(3);
		
		for(int i =0; i<3 ;i++) {
			executor.submit(new CyclicBarrierExample(cyclicBarrier));
		}
		
		cyclicBarrier.await();
		
		System.out.println("All thread completed.......");
		
	}

}
