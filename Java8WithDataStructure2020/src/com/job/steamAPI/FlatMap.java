package com.job.steamAPI;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMap {

	public static void main(String[] args) {

		//The map() method wraps the underlying sequence in a Stream instance, 
		//whereas the flatMap() method allows avoiding nested Stream<Stream<R>> structure. we call this one as a flattering also.

		List<List<String>> list1 = Arrays.asList(Arrays.asList("a"),
												   Arrays.asList("b"));

		List<Stream<String>> mapList  = list1.stream()
												.map(Collection::stream)
												.collect(Collectors.toList());

		List<String> flatMapList =    list1.stream()
												.flatMap(Collection::stream)
												.collect(Collectors.toList());
		
		//========================================================================

		List<Student> list = Arrays.asList(
				new Student(3,"bbb",Arrays.asList("BTM", "HSR")),
				new Student(1,"aaa",Arrays.asList("Madiwala", "JP")),
				new Student(2,"ccc",Arrays.asList("ST", "TT"))
				);

		Stream<String> list2 = list.stream().map(Student::getName);
		
		list2.forEach((e)->System.out.println(e));
		
		list.stream().map(e ->e.getAddress().stream()).flatMap(a -> a);;

		Stream<String> flatMap = list.stream().map(Student::getAddress).flatMap(a -> a.stream());

		flatMap.forEach((e)->System.out.println(e));

		Integer reduce = list.stream().map(Student::getEmpId).reduce(0, (a1,a2) -> a1 > a2 ? a1 : a2);

		int sum = list.stream().mapToInt(Student::getEmpId).sum();

		//System.out.println(sum);		
		//System.out.println(reduce);



	}

}
