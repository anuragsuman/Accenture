package com.job.steamAPI;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPIGetTheValueFromMap {
	

	public static void main(String[] args) {
		Map<String,Integer> mapForIntegerValue = new HashMap<String, Integer>();
		mapForIntegerValue.put("name1", 1);
		mapForIntegerValue.put("name2", 2);
		mapForIntegerValue.put("name3", 3);
		mapForIntegerValue.put("name4", 4);
		
		/* 
	        using for-each loop for iteration over Map.entrySet() 
	        for (Entry<String, Integer> entry : mapForIntegerValue.entrySet()) {  
	            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
	        }
        */
		
		/* 
			// using keySet() for iteration over keys 
			for (String name : mapForIntegerValue.keySet()) { 
			    System.out.println("key: " + name); 
			}
			  
			// using values() for iteration over keys 
			for (Integer url : mapForIntegerValue.values()){  
			    System.out.println("value: " + url); 
			}
		*/
		
		/*  
		    Iterating over Map.entrySet() using For-Each loop :
	        Iterator<Map.Entry<String, Integer>> itr = mapForIntegerValue.entrySet().iterator(); 
	          
	        while(itr.hasNext()){ 
	             Entry<String, Integer> entry = itr.next(); 
	             System.out.println("Key = "+entry.getKey()+", Value = "+entry.getValue()); 
	        } 
        */
		
		/* forEach(action) method to iterate map 
        	mapForIntegerValue.forEach((k,v) -> System.out.println("Key = "+ k + ", Value = " + v)); 
        */
        
    	/* looping over keys 
        for (String name : mapForIntegerValue.keySet()){ 
            Integer url = mapForIntegerValue.get(name); 
            System.out.println("Key = " + name + ", Value = " + url); 
        }
        */
		
		Map<String,String> mapForStringValue = new HashMap<String, String>();
		mapForStringValue.put("name1", "value1");
		mapForStringValue.put("name2", "value2");
		mapForStringValue.put("name3", "value3");
		mapForStringValue.put("name4", "value4");
		
		/*using for-each loop for iteration over Map.entrySet() 
        for (Map.Entry<String, String> entry : mapForStringValue.entrySet()) {  
            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
        }
        */
        
        //stream API use when value is string : filter use
        	//mapForStringValue.entrySet().stream().filter((e)->e.getValue().contains("1")).forEach((f)->System.out.println(f.getKey()+"_"+f.getValue()));
        
        //stream API use when value is integer : filter use
        	//mapForIntegerValue.entrySet().stream().filter((e)->(e.getValue()==1)).forEach((f)->System.out.println(f.getKey()+"_"+f.getValue()));
        	
        //stream API use when value is integer : sorted use
        	//mapForIntegerValue.entrySet().stream().sorted(Map.Entry.<String, Integer> comparingByValue()).forEach((f)->System.out.println(f.getKey()+"_"+f.getValue()));
        
		
		// sorting Map by values in ascending order, price here 
			//mapForIntegerValue.entrySet().stream() .sorted(Map.Entry.<String, Integer> comparingByValue()) .forEach(System.out::println); 
		
		// now, let's collect the sorted entries in Map 
			/*Map<String, Integer> sortedByPrice = mapForIntegerValue.entrySet().stream() .sorted(Map.Entry.<String, Integer> comparingByValue()) .
													collect(Collectors.toMap(e -> e.getKey(), e -> e.getValue())); 
			  System.out.println("Map incorrectly sorted by value in ascending order: " + sortedByPrice); 
			*/
		
		// the Map returned by the previous statement was not sorted 
		// because ordering was lost while collecting result in Map 
		// you need to use the LinkedHashMap to preserve the order 
		/*
		     Map<String, Integer> sortedByValue = mapForIntegerValue .entrySet() .stream() .sorted(Map.Entry.<String, Integer> comparingByValue()) .
															collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
			System.out.println("Map sorted by value in increasing order: " + sortedByValue); 
		*/
		// sorting a Map by values in descending order 
		// just reverse the comparator sorting by using reversed() method 
		/*
		  Map<String, Integer> sortedByValueDesc = mapForIntegerValue .entrySet() .stream() .sorted(Map.Entry.<String, Integer> comparingByValue().reversed()) 
							.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new)); 
		  System.out.println("Map sorted by value in descending order: " + sortedByValueDesc);
        */
		//How to iterate stream 
		Stream<Entry<String, String>> streamApi = mapForStringValue.entrySet().stream().filter((e)->e.getValue().contains("1"));
		Iterator<Entry<String, String>> iterator = streamApi.iterator();
		while(iterator.hasNext()) {
			Entry<String, String> et = iterator.next();
			System.out.println(et.getKey()+"__"+et.getValue());
		}
		

		// construct a Map.Entry to Map from the stream
		Map<String, String> map = streamApi.collect(Collectors.toMap(
														Map.Entry::getKey,
														Map.Entry::getValue));
		
		
	}
}
