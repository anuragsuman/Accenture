package com.job.steamAPI;

import java.util.*;
import java.util.function.Predicate;

public class PredicateInJava8 {

	public static void main(String[] args) {

		Map<String,String> map = new HashMap<String, String>();
		map.put("name", "anurag");
		map.put("name1", "rohit");
		map.put("name2", "jitendra");
		map.put("name3", "siva");

		List<User> list = new ArrayList<>();
		User user1 = new User();
		user1.setId(1);
		user1.setName("anurag");
		User user2 = new User();
		user2.setId(2);
		user2.setName("rohit");
		User user3 = new User();
		user3.setId(3);
		user3.setName("chacha");
		list.add(user1);
		list.add(user2);
		list.add(user3);

		/*
		 * Predicate:
				In Java 8, Predicate is a functional interface, which accepts an argument and returns a boolean
				example : filter() method from Stream interface. 
						  Stream<T> filter(Predicate<? super T> predicate);
		 */

		boolean present = list.stream().findAny().filter(e-> e.getId()>0).isPresent();
		System.out.println(present);

		Predicate<User> isNameIsAnurag = p -> p.getId() >= 1 && p.getName().equalsIgnoreCase("anurag");
		boolean recordIsThereInUserList = isNameIsAnurag.test(user1);
		System.out.println(recordIsThereInUserList);
		
		
		
	}

}
