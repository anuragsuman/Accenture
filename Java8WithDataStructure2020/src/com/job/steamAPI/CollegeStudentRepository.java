package com.job.steamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollegeStudentRepository {
	public static List<CollegeStudent> getCollegeStudents(){
		List<CollegeStudent> CollegeStudents = new ArrayList<CollegeStudent>();
		
		CollegeStudents.add(new CollegeStudent("First", 2, 3.6, "Male", Arrays.asList("Swimming", "Basketball")));
		CollegeStudents.add(new CollegeStudent("Second", 2, 3.8, "Female", Arrays.asList("Swimming", "Basketball", "Gymnastics")));
		CollegeStudents.add(new CollegeStudent("Third", 3, 4.0, "Male", Arrays.asList("Cricket", "Basketball")));
		CollegeStudents.add(new CollegeStudent("Fourth", 3, 3.9, "Female", Arrays.asList("Vollybll", "Basketball")));
		CollegeStudents.add(new CollegeStudent("Fifth", 4, 3.3, "Male", Arrays.asList("Soccor", "Basketball")));
		CollegeStudents.add(new CollegeStudent("Sixth", 4, 3.5, "Female", Arrays.asList("Swimming", "Basketball")));
		
		return CollegeStudents;
	}
}
