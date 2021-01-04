package com.job.producerAndConsumer;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

class InterviewSchedular implements Runnable{
	private BlockingQueue<String> bq;

	public InterviewSchedular(BlockingQueue<String> bq) {
		this.bq = bq;
	}
	@Override
	public void run() {
		System.out.println("10 candidate have arrived....");
		for(int i=1; i<=10 ; i++) {
			String msg = new String("candidate"+i);
			try {
				bq.put(msg);
				System.out.println("Interview scheduled for "+msg);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Interviewed scheduled for all the  candidates...");
		String msg1 = new String("Stop");
		try {
			bq.put(msg1);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
}

class InterviewProcessor implements Runnable{

	private BlockingQueue<String> bq;
	public InterviewProcessor(BlockingQueue<String> bq) {
		this.bq = bq;
	}

	@Override
	public void run() {
		try {
			String msg;
			Thread.sleep(10000);
			while(!(msg = bq.take()).equals("Stop")) {
				System.out.println("Interview completed for ..."+msg);
				Thread.sleep(10000);
			}
			System.out.println("Interview completed for all candidate...");
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}

}


public class BlockingQueueExample extends Thread{

	public static void main(String[] args) {

		BlockingQueue<String> bq = new ArrayBlockingQueue<String>(1);
		InterviewSchedular producer = new InterviewSchedular(bq);
		InterviewProcessor consumer = new InterviewProcessor(bq);

		new Thread(producer).start();
		new Thread(consumer).start();

	}
}
