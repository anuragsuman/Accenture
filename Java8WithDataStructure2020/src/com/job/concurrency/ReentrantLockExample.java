package com.job.concurrency;

import java.util.Scanner;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockExample {

	private int count=0;
	private Lock reentrantLock = new ReentrantLock();
	private Condition cond = reentrantLock.newCondition();
	public void increment() {
		for(int i=0; i<100000;i++) {
			count++;
		}
	}

	public void firstThread() throws InterruptedException {
		try {
			reentrantLock.lock();
			System.out.println("Waiting..");
			cond.await();
			System.out.println("Waken the thread...");
			increment();//suppose in this line if we get the exception so unlock() method will not execute.
		}
		finally{
			reentrantLock.unlock();
		}
	}

	public void secondThread() {
		try {
			reentrantLock.lock();
			System.out.println("Press the return key!");
			new Scanner(System.in).nextLine();
			System.out.println("Got the return key!");
			cond.signal();
			increment();//suppose in this line if we get the exception so unlock() method will not execute.
		}
		finally{
			reentrantLock.unlock();
		}
	}

	public void finish() {
		System.out.println(count);
	}
	public static void main(String[] args) throws InterruptedException {
		final ReentrantLockExample reentrantLockExample = new ReentrantLockExample();
		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					reentrantLockExample.firstThread();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}		
			}
		});
		t1.start();

		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				reentrantLockExample.secondThread();				
			}
		});
		t2.start();
		t1.join();
		t2.join();
		reentrantLockExample.finish();
	}
} 