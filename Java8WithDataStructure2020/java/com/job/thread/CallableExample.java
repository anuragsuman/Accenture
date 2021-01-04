package com.job.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableExample implements Callable<String> {

	@Override
	public String call() throws Exception {
		System.out.println(Thread.currentThread().getName());
		return "successfully";
	}
	
	public static void main(String[] args) throws Exception {
		
		//System.out.println(new CallableExample().call());
		
		//Below line is for execute the call method. 
		Future<String> string = Executors.newCachedThreadPool().submit(new CallableExample());
		
		//get the value what call method return.
		String resultOfCallMethod = string.get();
		
		System.out.println(resultOfCallMethod);
		
	}

}
