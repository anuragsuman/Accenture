package com.job.interview;

import java.util.HashMap;

public class DigitCountInMobileNumber {
	
	public static void main(String args[]) {

		String mobileNumber = "9902010315";
		char[] ch = mobileNumber.toCharArray();
		HashMap<Character,Integer> hm = new HashMap();		

		for(int i =0; i<=ch.length-1;i++) {
			char c = ch[i];
			if(hm.get(c) == null) {
				hm.put(c, 1);
			}else {
				hm.put(c, hm.get(c)+1);
			}
		}
		System.out.println(hm);
	}

}
