package com.job.interview;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class TVRemote {

	public static void main(String[] args) {

		ArrayList<String> output = doCheckString("BC","BANGALORE");
		System.out.println(output.toString());
	}

	private static ArrayList<String> doCheckString(String str1, String str2) {
		char[] remo = str2.toCharArray();
		LinkedHashSet hs = new LinkedHashSet();
		String accc = "";
		for(char c : remo) {
			hs.add(c);
		}
		
		String s2 = hs.toString().replace(",", "").replace(" ", "").replace("[", "").replace("]", "");
		
		
		ArrayList<String> result = new ArrayList(); 
		char[] c1= str1.toCharArray();
		char[] c2= s2.toCharArray();
		String abc1 ="";
		for(int i=0; i<c1.length ;i++) {
			if(!s2.contains(c1[i]+"")) {
				abc1+=c1[i];
			}
		}
		result.add(abc1);
		String abc ="";
		for(int i=0; i<c2.length ;i++) {
			if(!str1.contains(c2[i]+"")) {
				abc+=c2[i];
			}
		}
		result.add(abc);
		return result;
	}

}
