package com.job.collection;

import java.util.HashMap;

public class HashSetExample {
	
	private static final Object PRESENT = new Object();
	private transient HashMap hashMap = null;
	public HashSetExample() {
		hashMap = new HashMap();
	}
	public boolean add(String object) {
		return hashMap.put(object, PRESENT) == null;
	}
	

	public static void main(String args[]) {
		
		HashSetExample hashSetExample = new HashSetExample();
		hashSetExample.add("abc");
		hashSetExample.add("bcd");
		hashSetExample.add("abc");
		
		hashSetExample.toString();
		
		hashSetExample.hashMap.entrySet().stream().forEach((h) -> System.out.println(h.toString()));
		
	}

}
