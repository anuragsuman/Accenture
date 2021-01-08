package com.job.concurrency;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MultiLock {

	private Random random = new Random();
	private List<Integer> list1 = new ArrayList<Integer>();
	private List<Integer> list2 = new ArrayList<Integer>();
	
	Object lock1 = new Object();
	Object lock2 = new Object();

	//once we write the synchronized on the method then will not get ArrayIndexOutOfBoundException.
	public  void stageOne() {
		synchronized(lock1) {
			try {
				Thread.sleep(1);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			list1.add(random.nextInt(100));
		}
	}

	public synchronized void stageTwo() {
		synchronized(lock2) {
			try {
				Thread.sleep(1);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			list2.add(random.nextInt(100));
		}
	}
	public void process() {
		for(int i=0;i<1000;i++) {
			stageOne();
			stageTwo();
		}

	}
	public void main() throws InterruptedException {
		System.out.println("Starting .....");

		long start = System.currentTimeMillis();
		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				process();				
			}
		});
		t1.start();

		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				process();				
			}
		});
		t2.start();

		t1.join();
		t2.join();


		long end = System.currentTimeMillis();	

		System.out.println("Time Taken:"+(end-start));
		System.out.println("List1: "+list1.size()+" List2: "+list2.size());

	}
	public static void main(String[] args) throws InterruptedException {
		new MultiLock().main();

	}
}
