package com.synechron.prepration;
import java.util.LinkedList;

class ProducerAndConsumer{
	LinkedList<Integer> list = new LinkedList<Integer>();
	int capacity = 1;

	public void producer() throws InterruptedException{
		int value =0;
		while(true) {
			synchronized (this) {
				while(list.size() == capacity) {
					wait();
				}
				System.out.println("Producer:"+value);
				list.add(value++);
				notify();

				Thread.sleep(1000);
			}
		}
	}

	public void consumer() throws InterruptedException{
		while(true) {
			synchronized (this) {
				while(list.size() == 0) {
					wait();
				}
				int val = list.removeFirst();
				System.out.println("consumer:"+val);
				notify();
				Thread.sleep(1000);
			}
		}
	}
}




public class ProducerAndConsumerExample {


	public static void main(String[] args) throws InterruptedException {
		final  ProducerAndConsumer producerAndConsumer = new ProducerAndConsumer();

		Thread t1 = new Thread(()->{
			try {
				producerAndConsumer.producer();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		});

		Thread t2 = new Thread(()->{
			try {
				producerAndConsumer.consumer();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		});

		t1.start();
		t2.start();
		t1.join();
		t2.join();
	}

}
