package com.job.steamAPI;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMap1 {

	public static void main(String[] args) {
		
		//The map() method wraps the underlying sequence in a Stream instance, 
		//whereas the flatMap() method allows avoiding nested Stream<Stream<R>> structure. we call this one as a faltering also.
		
		List<List<String>> list = Arrays.asList(
									  Arrays.asList("a"),
									  Arrays.asList("b"));
		
		List<Stream<String>> mapList  = list.stream()
											.map(Collection::stream)
											.collect(Collectors.toList());
		
		List<String> flatMapList =    list.stream()
										  .flatMap(Collection::stream)
										  .collect(Collectors.toList());
		
	}

}
