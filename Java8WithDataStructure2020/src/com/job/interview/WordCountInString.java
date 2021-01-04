package com.job.interview;

import java.util.HashMap;

public class WordCountInString {
	
	

	public static void main(String[] args) {
		
		String abc = "India is a big country and India is multi language country ";
		
		HashMap<String, Integer> hashmap = new HashMap<String,Integer>();
		
		String a[] = abc.split(" ");
		
		for(int i =0; i<a.length;i++) {
			String bc = a[i];
			
			if(hashmap.get(bc) != null && hashmap.get(bc) > 0) {
				hashmap.put(bc, hashmap.get(bc)+1);
			}else {
				hashmap.put(bc, 1);
			}
			
		}
		
		System.out.println(hashmap);
		
		

	}

}
