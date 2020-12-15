package com.mgl.digital.sds.scrapper.app.service;

import java.util.*;
import java.util.stream.*;

import org.springframework.stereotype.Service;
/**
 * Write a method in Java8+, such that the method generates a sequence of numbers
 * between 1 and 1000 inclusive.
 * It then keeps only the ones which are multiples of 3 or 5 and then squares them.
 * It returns the first 10 numbers from the series.
 */
@Service
public class DefaultNumberService implements NumberService {

	@Override
	public Map<String, Object> getNumbers(){
		long startTime = System.nanoTime();
		Map<String, Object> response = new HashMap<>();
		List<Integer> result = IntStream.rangeClosed(1, 1000).
				filter(i -> i % 3 == 0 || i % 5 == 0).map(e->e*e).limit(10).boxed().collect(Collectors.toList());
		response.put("data", result);
		response.put("time_taken_InNonoSecond", System.nanoTime()-startTime);
		return response;
	}
}