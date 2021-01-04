package com.job.steamAPI;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class TerminalEx {
	
	// group by gender
	public static void groupByGender() {
		Map<String, List<CollegeStudent>>	CollegeStudentMap = CollegeStudentRepository.getCollegeStudents()
				.stream()
				.collect(Collectors.groupingBy(CollegeStudent::getGender));
		
		System.out.println(CollegeStudentMap);
	}
	
	//group by gpa values
	public static void groupByGpa() {
		
		Map<String, List<CollegeStudent>>	CollegeStudentMap = CollegeStudentRepository.getCollegeStudents()
				.stream()
				.collect(Collectors.groupingBy(CollegeStudent->CollegeStudent.getGpa() >= 3.5 ? "OUTSTANDING" : "AVERAGE"));
		
		System.out.println(CollegeStudentMap);
	}
	
	public static void main(String args[]) {
		// groupByGender();
		groupByGpa();
	}
}
