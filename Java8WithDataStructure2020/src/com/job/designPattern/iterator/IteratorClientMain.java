package com.job.designPattern.iterator;

public class IteratorClientMain {

	public static void main(String[] args) {
		CollectionImpl collectionImpl = new CollectionImpl();
		Iterator iterator = collectionImpl.getIterator();
		
		while(iterator.hasNext()) {
			Object name = (String)iterator.next();
			System.out.println("Name:"+name);
			
		}
	}

}
