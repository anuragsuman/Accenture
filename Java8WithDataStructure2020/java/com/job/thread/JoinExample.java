package com.job.thread;

public class JoinExample extends Thread{

	public void run(){ 
		Thread t = Thread.currentThread(); 
		System.out.println("Current thread: "+ t.getName()); 

		// checks if current thread is alive 
		System.out.println("Is Alive? "+ t.isAlive()); 
	} 

	public static void main(String args[]) throws Exception { 
		JoinExample joinExample = new JoinExample(); 
		joinExample.start(); 

		// Waits for 1000ms this thread to die. 
		joinExample.join(1000); 

		System.out.println("\nJoining after 1000"+ " mili seconds: \n"); 
		System.out.println("Current thread: " + joinExample.getName()); 

		// Checks if this thread is alive 
		System.out.println("Is alive? " + joinExample.isAlive()); 
	} 

}
