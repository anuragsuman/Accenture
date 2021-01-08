package com.job.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ThreadPoolProcessor implements Runnable{
	private int id;
	
	public ThreadPoolProcessor(int id) {
		this.id= id;
	}
    
	public void run() {
		System.out.println("Starting :"+id);
		try {
			Thread.sleep(5000);
			System.out.println(Thread.currentThread());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Completed :"+id);
	}
	public static void main(String[] args) throws InterruptedException {
		
		ExecutorService executor = Executors.newFixedThreadPool(5);
		for(int i =0; i<5 ;i++) {
			executor.submit(new ThreadPoolProcessor(i));
		}
		executor.shutdown();
		
		System.out.println("All tasks submitted.....");
		
		executor.awaitTermination(1, TimeUnit.DAYS);
		System.out.println("All tasks completed.....");
		
	}

}
