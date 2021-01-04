package com.job.thread;

public class WaitAndNotify{

	private Integer balance = 5000;
	
	synchronized void deposite(int saveAmount) throws InterruptedException {
		balance += saveAmount;
		System.out.println(balance);
		notify();
	}
	
	synchronized void withdraw(int withdrawlAmount) throws InterruptedException {
		if(withdrawlAmount > balance) {
			System.out.println("Insufficient balance");
		}
		wait();
		balance = balance-withdrawlAmount;
		System.out.println(balance);
	}
	
	public static void main(String[] args) {
		
		WaitAndNotify waitAndNotify = new WaitAndNotify();
		
		new Thread(new Runnable() 
        { 
            @Override
            public void run() 
            { 
                	try {
						waitAndNotify.withdraw(6000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
            } 
        }).start(); 
		
		new Thread(new Runnable() 
        { 
            @Override
            public void run() 
            { 
					try {
						waitAndNotify.deposite(3000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
            } 
        }).start(); 
		
	}

}
