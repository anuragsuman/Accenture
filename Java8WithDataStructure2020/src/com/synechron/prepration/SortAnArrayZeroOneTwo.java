package com.synechron.prepration;
import java.util.HashMap;

public class SortAnArrayZeroOneTwo {

	public static void main(String[] args) {
		int arr[] = { 0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1 };
		int t[] = new int[arr.length];
		HashMap<Integer,Integer> hashMap = new HashMap();
		
		for(int i =0; i<arr.length;i++) {
			for(int j =0; j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					hashMap.put(arr[i], j);
				}else {
					hashMap.put(arr[i], j);
				}
			}
		}

		System.out.println(hashMap);

	}

}
