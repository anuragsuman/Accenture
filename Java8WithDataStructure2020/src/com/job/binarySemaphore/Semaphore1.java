package com.job.binarySemaphore;
import java.util.concurrent.Semaphore;

public class Semaphore1 implements Runnable {

	Semaphore semaphore1;
	Semaphore semaphore2;
	
	
	public Semaphore1(Semaphore semaphore1,Semaphore semaphore2) {
		this.semaphore1 = semaphore1;
		this.semaphore2=semaphore2;
	}


	@Override
	public void run() {

		int i=0;
		
		while(i<20) {
			try {
				semaphore1.acquire(); // decrease the number from 1 to 0
				System.out.println("thread1: " + 1);
				i++;
				semaphore2.release(); // increase the number from 0 to 1
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		
		
		
	}

}
