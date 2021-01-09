package com.job.concurrency;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
public class InterruptedThreadExample {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("Starting...");
		
		//STEP-1//
//		
//		Thread t = new Thread(new Runnable() {
//			Random random = new Random();
//			@Override
//			public void run() {
//				for(int i = 0; i<1E8;i++) {
////					try {
////						Thread.sleep(1);
////					}catch(InterruptedException e) {
////						System.out.println(e.getMessage());
////						break;
////					}
//					if(Thread.currentThread().isInterrupted()) {
//						System.out.println("Intruppted");
//						break;
//					}
//					Math.sin(random.nextDouble());
//				}
//			}
//		});
//		t.start();
//		Thread.sleep(500);
//		t.interrupt();
//		t.join();
//	
		//STEP-2
		ExecutorService exe = Executors.newCachedThreadPool();
        Future<Void> fu = exe.submit(new Callable<Void>() {
			@Override
			public Void call() throws Exception {
				Random random = new Random();
				for(int i = 0; i<1E8;i++) {
					if(Thread.currentThread().isInterrupted()) {
						System.out.println("Intruppted");
						break;
					}
					Math.sin(random.nextDouble());
				}
				return null;
			}
		});
        exe.shutdown();
        Thread.sleep(500);
        fu.cancel(true);//when it is true it will set the intruppted thread
        exe.awaitTermination(1, TimeUnit.DAYS);
        System.out.println("Finshed!..");	
	}
}
