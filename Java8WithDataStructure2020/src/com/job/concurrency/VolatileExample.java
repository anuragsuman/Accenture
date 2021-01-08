package com.job.concurrency;

public class VolatileExample {
	private static  boolean flag =false;

	public static void main(String[] args) throws InterruptedException {
		new Thread(new Runnable() {
			@Override
			public void run() {
				for(int i =1; i<=2000;i++) {
					flag = true;
				}
				System.out.println("status flag changed to : "+flag);
			}
		}).start();
		 new Thread(new Runnable() {
			@Override
			public void run() {
				int i =1;
				while(!flag) {
					i++;
				}	
				System.out.println("start other processing: "+i);
			}
		}).start();
	}
}
