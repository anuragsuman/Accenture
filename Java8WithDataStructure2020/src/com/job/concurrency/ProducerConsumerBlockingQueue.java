package com.job.concurrency;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;



public class ProducerConsumerBlockingQueue {
   int capacity = 3;
	public void producer(BlockingQueue bq) throws InterruptedException {
		for(int i=1; i<10;i++) {
			if(i<=capacity) {
				System.out.println("put:"+i);
				bq.put(i);	
			}
		}
	}

	public void consumer(BlockingQueue bq) throws InterruptedException {
		while(true) {
			if(capacity>0) {
				System.out.println("take"+bq.take());
			}
		}
	}

	
	public static void main(String[] args) throws InterruptedException {
		BlockingQueue blockingQueue = new LinkedBlockingQueue();
			

		final ProducerConsumerBlockingQueue producerConsumer = new ProducerConsumerBlockingQueue();

		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run(){
				try {
					producerConsumer.producer(blockingQueue);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});

		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run(){
				try {
					producerConsumer.consumer(blockingQueue);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});

		t1.start();
		t2.start();

		blockingQueue.clear();
	
	}

}
