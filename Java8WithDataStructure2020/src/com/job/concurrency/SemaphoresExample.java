package com.job.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

class Connection{
	private static Connection instance = new Connection();

	private Semaphore sem = new Semaphore(20);
	
	private int connections = 0;

	private Connection() {

	}

	public static Connection getInstance() {
		return instance;
	}
	
	public void connect() throws InterruptedException {
		sem.acquire();
		try {
			doConnect();
		}finally {
			sem.release();
		}
	}

	public void doConnect() throws InterruptedException {
		sem.acquire();
		synchronized (this) {
			connections++;
			System.out.println("Current connection : "+ connections);
		}

		try {
			Thread.sleep(2000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}

		synchronized (this) {
			connections--;
		}
		
		sem.release();
	}
}

public class SemaphoresExample {

	public static void main(String[] args) throws InterruptedException {
		//Semaphores are often used to restrict the number of threads than can access some (physical or logical) resource. 
		Semaphore semaphore = new Semaphore(1);
		semaphore.acquire();
		/*
		 * Acquires a permit from this semaphore, blocking until one is available, or the thread is interrupted. 
		   Acquires a permit, if one is available and returns immediately, reducing the number of available permits by one. 
		   If no permit is available then the current thread becomes disabled for thread scheduling purposes and 
		   lies dormant until one of two things happens: 
		 */
		semaphore.release();
		//System.out.println("Available Permits: "+semaphore.availablePermits());


		ExecutorService executors = Executors.newCachedThreadPool();
		for(int i =0;i<200;i++) {
			executors.submit(new Runnable() {
				@Override
				public void run() {
					try {
						Connection.getInstance().connect();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			});
		}
		executors.shutdown();
		executors.awaitTermination(1, TimeUnit.DAYS);
		
		//how we can do the things with semaphore
	}
}
