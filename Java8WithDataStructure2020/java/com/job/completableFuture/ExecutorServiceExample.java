package com.job.completableFuture;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class ExecutorServiceExample {


	//1). Thread t = new Thread();
	//2). Runnable () -> run() -> no return type


	//3). Callable --> call()  --> Object --> Future future = 


	//main-thread
	public static void main(String[] args) throws InterruptedException, ExecutionException {

//		ExecutorService executorService = Executors.newSingleThreadScheduledExecutor();
//		Callable callable = new Callable() {
//			@Override
//			public Object call(){
//				System.out.println("njknsdvkj");
//				return 1;
//			}
//		};
//
//		Future future = executorService.submit(callable);
//
//		//System.out.println(future.get());

		ExecutorService es = Executors.newFixedThreadPool(1);
		//child-thread

		Future<Integer> future2 = es.submit(() -> {
			try {
				TimeUnit.SECONDS.sleep(10);
			}catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println("future");
			return 1;
		} );
		System.out.println(future2.get());
		

		System.out.println("Main end");

	}

}
