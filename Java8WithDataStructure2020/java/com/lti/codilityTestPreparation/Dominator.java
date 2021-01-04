package com.lti.codilityTestPreparation;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Dominator {
    //check any element is dominator or not in  the array.
	public static void main(String[] args) {
		int arr[] = new int[]{1,3,3,3,3,3,2,1}; 

		HashMap<Integer,Integer> hashMap = new HashMap();
		
		for(int i =0; i< arr.length;i++) {
			
			if(hashMap.get(arr[i])!=null && (hashMap.get(arr[i])>0)) {
				hashMap.put(arr[i], hashMap.get(arr[i])+1);
			}else {
				hashMap.put(arr[i], 1);
			}
			
		}
		
		int mid = arr.length/2;
		
		Map<Integer, Integer> collect = hashMap.entrySet().stream()
				                   .filter((e)->e.getValue()>mid)
				                   .collect(Collectors.toMap(Map.Entry::getKey,
				                                             Map.Entry::getValue));
		
		if(collect.entrySet().stream().count() >= 1) {
			System.out.println(collect.entrySet().stream().findFirst());
			System.out.println("Dominator");
		}else {
			System.out.println("Not Dominator");
		}
		
	}

}
