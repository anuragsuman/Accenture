package com.job.thread;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.*;

public class CallableAndFutureExample implements Callable<String>{
	
	@Override
	public String call() throws Exception {
		Thread.sleep(1000);
		return Thread.currentThread().getName();
	}

	public static void main(String[] args) {
		ExecutorService executorService = Executors.newFixedThreadPool(1);
		
		List<Future<String>> listFuture = new ArrayList<>();
		
		Callable<String> callable = new CallableAndFutureExample();
		
		for(int i=0;i<20;i++) {
			Future<String> future = executorService.submit(callable);//5 times it will call the call method
			listFuture.add(future);
		}
		
		for(Future<String> future : listFuture) {
			try {
				System.out.println(new Date()+":"+future.get());
			}catch(Exception e) {
				e.printStackTrace();
			}
			executorService.shutdown();
		}
		
	}
}
