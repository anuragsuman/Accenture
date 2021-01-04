package com.lti.codilityTestPreparation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DistinctCountOfListOfString {
	
	public static void main(String args[]) {
		
		List<String> list = new ArrayList<String>();
		list.add("anurag");
		list.add("rohit");
		
		long flatMap = list.stream().filter(e->e.startsWith("a")).flatMap(e->Arrays.stream(e.split(""))).distinct().count();
		System.out.println(flatMap);
		
	}

}
