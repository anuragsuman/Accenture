package com.job.binarySemaphore;

import java.util.concurrent.Semaphore;

public class Semaphore3 implements Runnable {

	Semaphore semaphore3;
	Semaphore semaphore1;	
	
	public Semaphore3(Semaphore semaphore3,Semaphore semaphore1) {
		this.semaphore3 = semaphore3;
		this.semaphore1=semaphore1;
	}


	@Override
	public void run() {
		
		
		int i=0;
		
		while(i<20) {
			try {
				semaphore3.acquire();
				System.out.println("thread3: " + 3);
				i++;
				semaphore1.release();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			
		}
		
	}

}
