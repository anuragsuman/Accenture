package com.job.concurrency;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableAndFutureExample {

	public static void main(String[] args) throws InterruptedException, ExecutionException {

		ExecutorService executor = Executors.newCachedThreadPool();

//		executor.submit(new Runnable() {
//			@Override
//			public void run() {
//				Random random = new Random();
//				int duration = random.nextInt(4000);
//				System.out.println("Starting ....");
//				try {
//					Thread.sleep(duration);
//				} catch (InterruptedException e) {
//					e.printStackTrace();
//				}
//				System.out.println("Finished!...");
//			}
//		});
		
		Future future = executor.submit(new Callable() {
			@Override
			public Object call() {
				Random random = new Random();
				int duration = random.nextInt(4000);
				System.out.println("Starting ....");
				try {
					Thread.sleep(duration);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				return duration;
			}
		});
		
		System.out.println(future.get());
		System.out.println("Finished!...");
	}
}
