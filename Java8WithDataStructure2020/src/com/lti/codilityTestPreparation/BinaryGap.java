package com.lti.codilityTestPreparation;

import java.util.*;

public class BinaryGap {

	private  void binaryGap(int number) {
		StringBuilder sb=new StringBuilder(number);  
		while(number>0) {
			int temp = number % 2;
			sb.append(temp);
			number = number /2 ;
		}
		System.out.println(sb.reverse());

		//find the binary gap : 10100
		String binary = sb.toString();
		int count = 0;
		int tmpCount = 0;
		for (int i = 0; i < binary.length(); i++) {
			if (binary.charAt(i) == '0') {
				if (i > 0 && binary.charAt(i - 1) == '1') {
					tmpCount++;
				} else {
					if (tmpCount > 0) tmpCount++;
				}
			} else if (binary.charAt(i) == '1') {
				if (tmpCount > 0 && tmpCount > count) {
					count = tmpCount;
				}
				tmpCount = 0;
			}
		}
		System.out.println(count);
	}

	public static void main(String[] args) {
		int number = 20;//10100
		new BinaryGap().binaryGap(number);

	}

}
