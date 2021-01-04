package com.job.steamAPI;

import java.util.List;
import java.util.stream.Collectors;

public class MapFlatMapEx {

	// extract the activites
	public static void getActivities() {
		/* List<List<String>> activities = CollegeStudentRepository.getCollegeStudents()
			.stream()  // Stream<CollegeStudent>
			// passing CollegeStudent to map and getting the activities
			.map(CollegeStudent->CollegeStudent.getActivities()) // Stream<List<String>>
			.collect(Collectors.toList());
			*/
		/*List<String> activities = CollegeStudentRepository.getCollegeStudents()
				.stream()  // Stream<CollegeStudent>
				// passing CollegeStudent to map and getting the activities
				// .map(CollegeStudent->CollegeStudent.getActivities()) // Stream<List<String>>
				.map(CollegeStudent::getActivities) 
				// List<List<String>> --- List<String>
				// for each list stream of string
				//.flatMap(activites -> activities.stream())
				.flatMap(List::stream) // Stream<String>
				.distinct()
				
				.collect(Collectors.toList());*/
		
		
			// System.out.println(activities);
		long count = CollegeStudentRepository.getCollegeStudents()
		.stream()  // Stream<CollegeStudent>
		// passing CollegeStudent to map and getting the activities
		// .map(CollegeStudent->CollegeStudent.getActivities()) // Stream<List<String>>
		.map(CollegeStudent::getActivities) 
		// List<List<String>> --- List<String>
		// for each list stream of string
		//.flatMap(activites -> activities.stream())
		.flatMap(List::stream) // Stream<String>
		.filter(activity -> activity.startsWith("S"))
		.distinct()
		.count();
		System.out.println("Number of activities : " + count);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getActivities();
	}

}
