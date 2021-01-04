package com.job.steamAPI;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamAPI {
	
	public static void main(String[] args) {
	
		Map<String,String> map = new HashMap<String, String>();
		map.put("name", "anurag");
		map.put("name1", "rohit");
		map.put("name2", "jitendra");
		map.put("name3", "siva");
		
		
		map.entrySet().stream().filter((e) -> e.getValue().length()>5)
								.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue))
								.entrySet().stream().collect(Collectors.toList())
								.forEach((e) -> System.out.println(e.getKey()+"_"+e.getValue()));
		
		//map.entrySet().stream().collect(Collectors.toSet()).forEach((e) -> System.out.println(e.getKey()+"__"+e.getValue()));
		
		//List<String> substringsBetween = Arrays.asList("Anurag/Dharkan","Suman/Tere Name"); 
		
		//map() method we are using for manipulating the stream.
		//substringsBetween.stream().map(e ->  e+"abc").collect(Collectors.toList()).forEach((e)->System.out.println(e));
		
		//filter() method we are using for filtering the stream.
		//substringsBetween.stream().filter((e) ->  e.contains("Anurag/Dharkan")).collect(Collectors.toList()).forEach((e)->System.out.println(e));
		
		
		
	}	
}
