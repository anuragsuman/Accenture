package com.job.completableFuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

public class MyCompletableFuture {

	public static void main(String[] args) throws InterruptedException, ExecutionException {

		
		CompletableFuture<String> supplyAsync = CompletableFuture.supplyAsync(() -> {
			 try {
			        TimeUnit.SECONDS.sleep(2);
			    } catch (InterruptedException e) {
			        throw new IllegalStateException(e);
			    }
			 
			 return "result after completion task1";
		});
		
		System.out.println(supplyAsync.get());
		
		CompletableFuture<Void> thenAccept = supplyAsync.thenAccept((a) -> {
			
			try {
		        TimeUnit.SECONDS.sleep(2);
		    } catch (InterruptedException e) {
		        throw new IllegalStateException(e);
		    }
        System.out.println(a + "  end");
		});
		
		
		
		CompletableFuture<String> thenApply = supplyAsync.thenApply((msg) ->{
			try {
		        TimeUnit.SECONDS.sleep(2);
		    } catch (InterruptedException e) {
		        throw new IllegalStateException(e);
		    }
			
			return  msg + "  completed";
		}
		);
		
		System.out.println("thenApply: " + thenApply.get());
		
		
		CompletableFuture<String> join1 = CompletableFuture.supplyAsync(() ->{
			try {
		        TimeUnit.SECONDS.sleep(2);
		    } catch (InterruptedException e) {
		        throw new IllegalStateException(e);
		    }
			return "task1";
		});
		
		CompletableFuture join2 = CompletableFuture.supplyAsync(() -> {
			try {
		        TimeUnit.SECONDS.sleep(2);
		    } catch (InterruptedException e) {
		        throw new IllegalStateException(e);
		    }
			return "task2";
		});
		
		
		
		CompletableFuture<CompletableFuture<String>>  app =     join1.thenApply( (b) -> CompletableFuture.supplyAsync( () -> b + " task3"));
		
		
		CompletableFuture<String> thenCompose = join1.thenCompose( (a) -> CompletableFuture.supplyAsync(() ->  a+" ................"));
		
		
		CompletableFuture thenCombine = join1.thenCombine(join2, (a,b) -> a+b );
		
		System.out.println(thenCompose.get());
		
		System.out.println(thenCombine.get());
	}

}
