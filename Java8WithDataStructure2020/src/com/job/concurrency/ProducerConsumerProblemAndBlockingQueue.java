package com.job.concurrency;

import java.util.LinkedList;

public class ProducerConsumerProblemAndBlockingQueue {

	LinkedList<Integer> list = new LinkedList<Integer>();
	int capacity =2;

	public void producer() throws InterruptedException {
		int value =0;
		while(true) {
			synchronized (this) {
				while(list.size()==capacity) {
					wait();
				}
				System.out.println("Produced:"+value);
				list.add(value++);
				notify();
				Thread.sleep(1000);	
			}
		}
	}

	public void consumer() throws InterruptedException {
		while(true) {
			synchronized (this) {
				while(list.size()==0) {
					wait();
				}
				int val = list.removeFirst();
				System.out.println("consumed:"+val);
				notify();
				Thread.sleep(1000);	
			}

		}
	}

	public static void main(String[] args) throws InterruptedException {
		final ProducerConsumerProblemAndBlockingQueue producerConsumer = new ProducerConsumerProblemAndBlockingQueue();

		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run(){
				try {
					producerConsumer.producer();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});

		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run(){
				try {
					producerConsumer.consumer();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});

		t1.start();
		t2.start();

		t1.join();
		t2.join();

	}

}
