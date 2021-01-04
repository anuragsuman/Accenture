package com.job.binarySemaphore;

import java.util.concurrent.Semaphore;

public class Semaphore123 {


	 public static void main(String[] args) {
		
		 Semaphore semaphore1 =new Semaphore(1);
		 Semaphore semaphore2 =new Semaphore(0);
		 Semaphore semaphore3 =new Semaphore(0);
		 
		 Semaphore1 s1 = new Semaphore1(semaphore1,semaphore2);
		 Semaphore2 s2 = new Semaphore2(semaphore2,semaphore3);
		 Semaphore3 s3 = new Semaphore3(semaphore3,semaphore1);
		 
		 
		 Thread t1 = new Thread(s1);
		 Thread t2 = new Thread(s2);
		 Thread t3 = new Thread(s3);
		 
		 t1.start();
		 t2.start();
		 t3.start();
	}

}
