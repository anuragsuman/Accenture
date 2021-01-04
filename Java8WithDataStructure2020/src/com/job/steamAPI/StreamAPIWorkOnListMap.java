package com.job.steamAPI;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.stream.Collectors;

class User{
	private int  id;
	private String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}

public class StreamAPIWorkOnListMap extends Thread{
	
	public static void main(String args[]) {
		List<User> list = new ArrayList<>();
		
		User user1 = new User();
		user1.setId(1);
		user1.setName("anurag");
		
		User user2 = new User();
		user2.setId(2);
		user2.setName("rohit");
		
		User user3 = new User();
		user3.setId(3);
		user3.setName("gohit");
		
		list.add(user1);
		list.add(user2);
		list.add(user3);
		
		
		List<User> list1 = new ArrayList<>();
		
		
		
		
		list.stream().map(e->
			list1.stream().map(b->b.getId())
		);
		
		list1.forEach(e->System.out.println(e.getId()+" " +e.getName()));
		
		List<User> users = list.stream().sorted((e1,e2)->e1.getName().compareTo(e2.getName())).collect(Collectors.toList());
		
		//users.forEach((e)->System.out.println(e.getId()+" "+e.getName()));
		
		
		Map<User,Integer> mapForIntegerValue = new HashMap<User, Integer>();
		mapForIntegerValue.put(user1, 1);
		mapForIntegerValue.put(user3, 2);
		mapForIntegerValue.put(user2, 3);
		
//		mapForIntegerValue.entrySet()
//							  .stream()
//		                        .sorted(Map.Entry.comparingByKey(Comparator.comparing(User::getName,(e1,e2)->e1.length()-e2.length())))
//		                           .forEach((e) -> System.out.println(e.getKey().getId()+" "+e.getKey().getName()));
//		
		
//		mapForIntegerValue.entrySet()
//		  .stream()
//          .sorted(Map.Entry.comparingByKey(Comparator.comparing(User::getName, Comparator.comparing(String::length).reversed())))
//             .forEach((e) -> System.out.println(e.getKey().getId()+" "+e.getKey().getName()));
		
		
//		mapForIntegerValue.entrySet()
//		  .stream()
//		  .sorted(Map.Entry.comparingByKey(Comparator.comparing(User::getName).thenComparing(User::getId)))
//		  //.sorted(Map.Entry.comparingByKey(Comparator.comparing(User::getId)))
//           .forEach((e) -> System.out.println(e.getKey().getId()+" "+e.getKey().getName()));
		
		mapForIntegerValue.entrySet()
		  .stream()
		  .sorted(Map.Entry.comparingByKey(Comparator.comparing(User::getName)));
		
		mapForIntegerValue.entrySet()
		  .stream()
		  .sorted(Map.Entry.comparingByKey(Comparator.comparing(User::getId)))
       .forEach((e) -> System.out.println(e.getKey().getId()+" "+e.getKey().getName()));
		
		
		
		
		
		
		
	}
	
	
}
