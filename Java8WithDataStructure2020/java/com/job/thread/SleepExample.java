package com.job.thread;

public class SleepExample extends Thread{

	public void run(){ 
		for (int i = 0; i < 4; i++){ 
			System.out.println(Thread.currentThread().getName() + "  " + i); 
			try{ 
				// thread to sleep for 1000 milliseconds 
				Thread.sleep(1000); 
			}catch (Exception e){ 
				System.out.println(e); 
			} 
		}
	}

	public static void main(String[] args) {
		SleepExample sleepExample = new SleepExample();
		sleepExample.start();
	}

}
