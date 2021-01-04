package com.job.countingSemaphore;

import java.util.concurrent.Semaphore;

public class semaphore1  implements Runnable{
	
	private Semaphore semaphore;
	
	public semaphore1(Semaphore semaphore) {
		this.semaphore =semaphore;
	}
	
	@Override
	public void run() {
		try {
			semaphore.acquire();
			int i=1;
			while(i<=10) {
				System.out.println("Thread1");
				i++;
			}
			Thread.sleep(2000);
			semaphore.release();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}