package com.job.concurrency;

import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Account{
	private int balance = 10000;
	public int getBalance() {
		return balance;
	}
	public void deposit(int amount) {
		this.balance+=amount;
	}
	public void withdraw(int amount) {
		balance-=amount;
	}
	public static void transfer(Account acc1, Account acc2, int amount) {
		acc1.withdraw(amount);
		acc2.deposit(amount);
	}
}
public class DeadLockExample {

	private Lock reentrantLock = new ReentrantLock();
	private Condition cond = reentrantLock.newCondition();
	private Account acc1 = new Account();
	private Account acc2 = new Account();

	private Lock lock1 = new ReentrantLock();
	private Lock lock2 = new ReentrantLock();

	private void acquireLocks(Lock firstLock, Lock secondLock) throws InterruptedException {
		while(true) {
			//Acquire locks 
			boolean gotFirstLock = false;
			boolean gotSecondLock = false;

			try {
				gotFirstLock = lock1.tryLock();
				gotSecondLock = lock2.tryLock();
			}finally {

				if(gotFirstLock && gotSecondLock) {
					return;
				}
				if(gotFirstLock) {
					firstLock.unlock();
				}
				if(gotSecondLock) {
					secondLock.unlock();
				}
			}
			//lock not acquired
			Thread.sleep(1);
		}
	}
	public void firstThread() throws InterruptedException {
		Random random = new Random();
		for(int i =0; i< 10000;i++) {
			//lock1.lock();
			//lock2.lock();
			acquireLocks(lock1, lock2);
			try {
				Account.transfer(acc1, acc2, random.nextInt(100));
			}finally {
				lock1.unlock();
				lock2.unlock();
			}
		}
	}

	public void secondThread() throws InterruptedException{
		Random random = new Random();
		for(int i =0; i< 10000;i++) {
			//deadlock condition will happen if lock2.lock(); lock1.lock();
			//so we use tryLock() to avoid the deadlock
			//here we are checking the condition if lock is acquire then do the unlock().
			//lock2.lock();
			//lock1.lock();
			//acquireLocks(lock1, lock2);
			acquireLocks(lock2, lock1);
			try {
				Account.transfer(acc2, acc1, random.nextInt(100));
			}finally {
				lock1.unlock();
				lock2.unlock();
			}
		}
	}

	public void finish() {
		System.out.println("Account 1 Balance : "+acc1.getBalance());
		System.out.println("Account 2 Balance : "+acc2.getBalance());
		System.out.println("Total Balance : "+(acc1.getBalance()+acc2.getBalance()));
	}
	public static void main(String[] args) throws InterruptedException {
		final DeadLockExample reentrantLockExample = new DeadLockExample();
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

		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					reentrantLockExample.secondThread();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}				
			}
		});
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		reentrantLockExample.finish();
	}
}