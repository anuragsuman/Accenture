package com.job.steamAPI;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;


public class ConsumerEx {

	static Consumer<CollegeStudent> nameDisplay = CollegeStudent -> System.out.println(CollegeStudent.getName());
	
	static Consumer<CollegeStudent> activitiesDisplay = CollegeStudent -> System.out.println(CollegeStudent.getActivities());
	
	static Predicate<CollegeStudent> filterOnGrade = CollegeStudent -> CollegeStudent.getGrade() > 2;
	
	// static Predicate<CollegeStudent> filterOnGpa = CollegeStudent -> CollegeStudent.getGpa() >= 3.5;
	static Predicate<CollegeStudent> filterOnGpa = ConsumerEx :: filterCollegeStudentsOnGpa;
	
	static Supplier<List<CollegeStudent>> CollegeStudentsFromRepository = () -> CollegeStudentRepository.getCollegeStudents();
	
	
	
	static boolean filterCollegeStudentsOnGpa(CollegeStudent CollegeStudent) {
		if(CollegeStudent.getGpa() >= 3.5)
			return true;
		return false;
					
	}
	
	public static void displayNamesOfAll() {
		// forEach added with default definition
		// forEach(<Consumer>)
	    //CollegeStudentRepository.getCollegeStudents().forEach(nameDisplay); // ~ accept
		CollegeStudentsFromRepository.get().forEach(nameDisplay); // ~ accept
	}
	
	public static void displayNamesAndActivitiesOfAll() {
		// forEach added with default definition
		// forEach(<Consumer>)
		CollegeStudentRepository.getCollegeStudents().forEach(nameDisplay.andThen(activitiesDisplay));
	}
	
	public static void displayNamesAndActivitiesOfAllBasedOnGrade() {
		// forEach added with default definition
		// forEach(<Consumer>)
		CollegeStudentRepository.getCollegeStudents().forEach(CollegeStudent -> {
				/*if(CollegeStudent.getGrade() > 2) {
					nameDisplay.andThen(activitiesDisplay).accept(CollegeStudent);
				}*/
			// if(filterOnGrade.and(filterOnGpa).test(CollegeStudent)) {
			if(filterOnGrade.and(ConsumerEx :: filterCollegeStudentsOnGpa).test(CollegeStudent)) {
				nameDisplay.andThen(activitiesDisplay).accept(CollegeStudent);
			}
		});
				
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 displayNamesOfAll();
		// displayNamesAndActivitiesOfAll();
		//displayNamesAndActivitiesOfAllBasedOnGrade();
		
	}

}
