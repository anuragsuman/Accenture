package com.job.steamAPI;

import java.util.*;
import java.util.Map.Entry;
import java.util.stream.IntStream;
import java.util.stream.Stream;


public class StreamAPIWithReduceFunction {

	public static void main(String[] args) {

		User user1 = new User();
		user1.setId(1);
		user1.setName("anurag");

		User user2 = new User();
		user2.setId(2);
		user2.setName("rohit");

		User user3 = new User();
		user3.setId(3);
		user3.setName("gohit");

		Map<User,Integer> map = new HashMap<User, Integer>();
		map.put(user1, 1);
		map.put(user3, 2);
		map.put(user2, 3);

		Optional<Entry<User, Integer>> sOptional = map.entrySet().stream()
				.sorted(Map.Entry.comparingByKey(Comparator.comparing(User::getName)))
				.reduce((e1,e2)->e1.getKey().getId() <= e2.getKey().getId() ? e1 : e2);

		//System.out.println(sOptional.get().getKey().getId()+"__"+sOptional.get().getKey().getName());

		List<Student> list = Arrays.asList(
				new Student(3,"bbb",Arrays.asList("BTM", "HSR")),
				new Student(1,"aaa",Arrays.asList("Madiwala", "JP")),
				new Student(2,"ccc",Arrays.asList("ST", "TT"))
				);

		Integer reduce = list.stream().map(Student::getEmpId).reduce(0, (a1,a2) -> a1 > a2 ? a1 : a2);

		//System.out.println(reduce);
		
		list.stream().reduce((e1,e2) -> e1.getName().length() > e2.getName().length() ? e2 : e1);
		
		
		OptionalInt reduce2 = IntStream.range(0, 5).reduce((a,b)-> a+b);
		
		//System.out.println(reduce2.getAsInt());
		
		
		
		Integer reduce3 = Arrays.asList(1,2,3).parallelStream().reduce(10, (a,b)-> a+b ,(a,b)->{
			System.out.println("combiner is called");
			return a+b;
		});
		//11,12,13 = After combiner called  (a). 13+12 = 25 , (b). 25+11 = 36 
		
		System.out.println(reduce3);
		

	}
}
