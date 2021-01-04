package com.job.countingSemaphore;

import java.util.concurrent.Semaphore;

public class Semaphore123 {

	public static void main(String[] args) {
		
		Semaphore semaphore = new Semaphore(4);
		semaphore1 semaphore1 = new semaphore1(semaphore);
		semaphore2 semaphore2 = new semaphore2(semaphore);
		semaphore3 semaphore3 = new semaphore3(semaphore);
		semaphore4 semaphore4 = new semaphore4(semaphore);
		
		Thread t1 = new Thread(semaphore1);
		Thread t2 = new Thread(semaphore2);
		Thread t3 = new Thread(semaphore3);
		Thread t4 = new Thread(semaphore4);
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}

}
