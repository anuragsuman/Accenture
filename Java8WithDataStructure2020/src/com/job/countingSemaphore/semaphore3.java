package com.job.countingSemaphore;

import java.util.concurrent.Semaphore;

public class semaphore3  implements Runnable{
	
	private Semaphore semaphore;
	
	public semaphore3(Semaphore semaphore) {
		this.semaphore =semaphore;
	}
	
	@Override
	public void run() {
		try {
			semaphore.acquire();
			int i=1;
			while(i<=10) {
				System.out.println("Thread3");
				i++;
			}
			Thread.sleep(2000);
			semaphore.release();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}