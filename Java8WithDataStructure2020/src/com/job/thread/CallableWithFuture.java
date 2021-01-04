package com.job.thread;

import java.util.concurrent.*;

public class CallableWithFuture {
	
	 /*
		java.util.concurrent.The callable object can return the computed result done by a thread in contrast to a runnable interface 
		which can only run the thread. 
		The Callable object returns a Future object which provides methods to monitor the progress of a task being executed by a thread.
		The future object can be used to check the status of a Callable and then retrieve the result from the Callable once the thread 
		is done. It also provides timeout functionality.
	 */
	
	/*
	  submit the callable using ThreadExecutor
	  and get the result as a Future object
	  Future<Long> result10 = executor.submit(new FactorialService(10));  

	  get the result using get method of the Future object
	  get method waits till the thread execution and then return the result of the execution.
	  Long factorial10 = result10.get();
	*/
	 static class FactorialService implements Callable<Long> {
	      private int number;

	      public FactorialService(int number) {
	         this.number = number;
	      }

	      @Override
	      public Long call() throws Exception {
	         return factorial();
	      }

	      private Long factorial() throws InterruptedException {
	         long result = 1;
	         Thread.sleep(3000);
	         while (number != 0) {              
	            result = number * result;
	            number--;
	            Thread.sleep(100);          
	         }
	         return result;      
	      }
	   }
	 
	 //post API should not take more than 10 min -----{ but because of n/w issue, post api is taking 20 min} 
	 //--> then we have to throw exception 
	 //Future<String> response = executor.submit(post API - callable );
	 //String resultOutput = response.get();
	 
	public static void main(final String[] arguments) throws InterruptedException, ExecutionException, TimeoutException {

	      ExecutorService executor = Executors.newSingleThreadExecutor();

	      System.out.println("Factorial Service called for 10!");
	      //Future Interface is for holding the result of the callable.
	      Future<Long> result10 = executor.submit(new FactorialService(10));

	      Long factorial10 = result10.get(2,TimeUnit.SECONDS);
	      System.out.println("10! = " + factorial10);

	      executor.shutdown();
	   }  

}
