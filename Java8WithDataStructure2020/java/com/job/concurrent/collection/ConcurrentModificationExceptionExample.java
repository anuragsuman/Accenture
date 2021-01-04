package com.job.concurrent.collection;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class ConcurrentModificationExceptionExample extends Thread{
	
	
	//static List<String> list = new ArrayList<String>();
	static CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<String>();
	
	public void run() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		list.add("D");
	}
	
	public static void main(String args[]) throws InterruptedException {
		
		list.add("A");
		list.add("B");
		list.add("C");
		
		ConcurrentModificationExceptionExample t1 = new ConcurrentModificationExceptionExample();
		t1.start();
		
		Iterator iterator = list.iterator();
		while(iterator.hasNext()) {
			String name = (String) iterator.next();
			Thread.sleep(1000);
		}
		System.out.println(list);
		
		
	}

}
