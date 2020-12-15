package com.mgl.digital.sds.scrapper.app.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

/**
 * Given an array and a target value, return the indices of two numbers whose sum will equal the target.
 * array = [0, 29, 10, 8, 19, 2], target = 37
 * should return
 * [1, 3]
 */

@Service
public class YourTargetNumberService implements TargetNumberService {

	@Override
	public int[] indices(int[] arr, int target){
		Map<Integer,Integer> numMap = new HashMap<Integer,Integer>(2);
		for(int i =0; i<arr.length;i++) {
			int complement = target - arr[i];
			if(numMap.containsKey(complement)) {
				return new int[] {numMap.get(complement),i};
			}else {
				numMap.put(arr[i], i);
			}
		}
		throw new IllegalStateException("wrong input");
	}
}