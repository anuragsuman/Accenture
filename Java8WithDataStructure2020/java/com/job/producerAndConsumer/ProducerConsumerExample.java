package com.job.producerAndConsumer;

class ProducerConsumer{

   Integer balance = 5000;

	public void producerCredit(int credit) throws InterruptedException{
		synchronized(this) {
			this.balance += credit;
			System.out.println("Total Balance : "+balance);
			notify();
			Thread.sleep(2000);
		}
	}

	public void consumerDebit(int withdrawal) throws InterruptedException {
		synchronized(this) {
			if(balance < withdrawal) {
				System.out.println("Trying to debit: "+withdrawal+" more than balance: "+balance+".......!");
				notify();
			}else{
				this.balance -= withdrawal;
				System.out.println("Debited Amount :"+withdrawal + "Available Balance :"+ balance);
				wait();
				Thread.sleep(2000);
			}
		}
	}

}
public class ProducerConsumerExample extends Thread{

	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("Login....");

		final ProducerConsumer producerConsumer = new ProducerConsumer();
		
		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run(){
				try {
					producerConsumer.producerCredit(10000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		
		Runnable  e = ()->  {
			try {
				producerConsumer.consumerDebit(20000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		};
		
		
		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run(){
				try {
					producerConsumer.consumerDebit(20000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		
		t1.start();
		t2.start();
		t1.join();//--> it will wait till t1 will complete the task and die.
		t2.join();

		System.out.println("Logout....");
	}
}
