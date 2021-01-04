package com.job.steamAPI;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class UserA{
	private int id;
	private String name;
	private long salary;
	
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

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}

	public UserA(int id, String name, long salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "UserA [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
}

public class AllSortingProgramUsingStream {

	public static void main(String[] args) {
		
		List<UserA> users = new ArrayList<UserA>();
		UserA userAnurag = new UserA(10,"anurag",1000l);
		UserA userRohit = new UserA(11,"rimjhim",2000l);
		UserA a1 = new UserA(10,"abnurag",1000l);
		UserA us = new UserA(13,"rbimjhim",2000l);
		users.add(userAnurag);
		users.add(userRohit);
		users.add(a1);
		users.add(us);
		
		//Method_1
		List<UserA> userAList = users.stream()
				                     .sorted((e1,e2)->e1.getName()
				                     .compareTo(e2.getName()))
				                     .collect(Collectors.toList());
		userAList.forEach((e)->System.out.println(e.getId()+"_"+e.getName()+"_"+e.getSalary()));
		
		//Method_1
		List<UserA> userList = users.stream()
									.sorted(Comparator.comparing(UserA::getId)
									.thenComparing(Comparator.comparing(UserA::getName)))
									.collect(Collectors.toList());
		userList.forEach((e)->System.out.println(e.getId()+"_"+e.getName()+"_"+e.getSalary()));
		
		
		HashMap<UserA,Integer> hashmap = new HashMap<UserA,Integer>(); 
		hashmap.put(userRohit, 1);
		hashmap.put(userAnurag, 2);
		
		Stream<Entry<UserA, Integer>> sorted = hashmap.entrySet().stream().sorted((e1,e2)->e1.getValue()-e2.getValue());
		
		sorted.forEach((e)->System.out.println(e.getKey()+""+e.getValue()));
		

		Stream<Entry<UserA, Integer>> sortedMap = hashmap.entrySet().stream().sorted((e1,e2)->e1.getKey().getId()-e2.getKey().getId());
		
		sortedMap.forEach((e)->System.out.println(e.getKey()+""+e.getValue()));
		
	}

}
