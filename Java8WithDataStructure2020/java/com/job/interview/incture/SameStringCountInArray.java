package com.job.interview.incture;

import java.util.*;

public class SameStringCountInArray {
	
	public static void main(String args[]) {
	
		String [] inputs = {"toy", "toy", "bus", "gun"};
		
		Map<String,Integer> hashmap = new HashMap<>();
		
		for(int i = 0; i <= inputs.length-1 ; i++) {
			if(hashmap.get(inputs[i]) == null) {
				hashmap.put(inputs[i], 1);
			}else {
				hashmap.put(inputs[i], hashmap.get(inputs[i])+1);
			}
		}
		
		hashmap.entrySet().stream().forEach((e) -> System.out.println(e.getKey()+" : "+e.getValue()));
		
	}

}
