package com.job.binarySemaphore;

import java.util.concurrent.Semaphore;

public class Semaphore2 implements Runnable {

	Semaphore semaphore2;
	Semaphore semaphore3;	
	
	public Semaphore2(Semaphore semaphore2,Semaphore semaphore3) {
		this.semaphore2 = semaphore2;
		this.semaphore3=semaphore3;
	}


	@Override
	public void run() {

		
		
       int i=0;
		
		while(i<20) {
			try {
				semaphore2.acquire();
				System.out.println("thread2: " + 2);
				i++;
				semaphore3.release();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		
		
	}

}
