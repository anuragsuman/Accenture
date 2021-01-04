package com.job.steamAPI;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ExploreStream {

	static Predicate<CollegeStudent> filterOnGrade = CollegeStudent -> CollegeStudent.getGrade() > 2;
	static Predicate<CollegeStudent> filterOnGpa = CollegeStudent -> CollegeStudent.getGpa() >= 3.5;
	
	public static void main(String args[]) {
	 	/*List<CollegeStudent> filteredCollegeStudents = CollegeStudentRepository.getCollegeStudents()
			.stream().peek(CollegeStudent -> System.out.println("Initiated : " + CollegeStudent))
			.filter(filterOnGrade).peek(CollegeStudent -> System.out.println("Ist Filter : " + CollegeStudent))
			// .filter(filterOnGrade.and(filterOnGpa)) // return another stream 
			.filter(filterOnGpa).peek(CollegeStudent -> System.out.println("IInd Filter : " + CollegeStudent)) 
			.collect(Collectors.toList());
			//.forEach(System.out::println);*/
		
			Map<String, List<String>> CollegeStudentMap= CollegeStudentRepository.getCollegeStudents()
				.stream().peek(CollegeStudent -> System.out.println("Initiated : " + CollegeStudent))
				.filter(filterOnGrade).peek(CollegeStudent -> System.out.println("Ist Filter : " + CollegeStudent))
			  //.filter(filterOnGrade.and(filterOnGpa)) // return another stream 
				.filter(filterOnGpa).peek(CollegeStudent -> System.out.println("IInd Filter : " + CollegeStudent)) 
				.collect(Collectors.toMap(CollegeStudent::getName, CollegeStudent::getActivities));
				
				// .collect(Collectors.toList());
				// .forEach(System.out::println);
				// peek(<Consumer>)
	 	
	 	System.out.println("\nFinal Data");
	 	// System.out.println(filteredCollegeStudents);
	 	System.out.println(CollegeStudentMap);	
	 	
	 	CollegeStudentRepository.getCollegeStudents()
		.stream().peek(CollegeStudent -> System.out.println("Initiated : " + CollegeStudent))
		.filter(filterOnGrade).peek(CollegeStudent -> System.out.println("Ist Filter : " + CollegeStudent))
		// .filter(filterOnGrade.and(filterOnGpa)) // return another stream 
		.filter(filterOnGpa).peek(CollegeStudent -> System.out.println("IInd Filter : " + CollegeStudent)); 
			
	}
}
