package com.mgl.digital.sds.scrapper.app.service;

import org.springframework.stereotype.Service;

/**
 * Given an array and a target value, return the indices of two numbers whose sum will equal the target.
 * array = [0, 29, 10, 8, 19, 2], target = 37
 * should return
 * [1, 3]
 */
@Service
public class YourTargetNumberService implements TargetNumberService {
    int[] resultIndex = new int[2];
    
    @Override
    public int[] indices(int[] arr, int target) {
       
    	for(int i =0; i<arr.length;i++) {
    		for(int j =0; j<arr.length;j++) {
        		if(arr[i]+arr[j]==target) {
        			resultIndex[0]= i;
        			resultIndex[1]=j;
        			break;
        		}
        	}
    	}
    	
        return resultIndex;
    }
}