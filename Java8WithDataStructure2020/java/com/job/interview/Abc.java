package com.job.interview;

import java.util.*;

public class Abc {
	
	

	public static void main(String[] args) {
		List<String> input = Arrays.asList("U1,U2","U3,U4","U2,U1","U1,U5");
		
		//String[] output = {"U1,U2","U1,U5","U3,U4"};
		
		String s1= "U1,U2";
		String s2= "U2,U1";
		
		Arrays.sort(s1.toCharArray());
		Arrays.sort(s2.toCharArray());
		
		if(s1.equals(s2)) {
			System.out.println(s1);
		}

	}

}
