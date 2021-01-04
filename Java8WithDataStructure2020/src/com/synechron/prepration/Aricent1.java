package com.synechron.prepration;
import java.util.HashSet;
import java.util.Set;

public class Aricent1 {

	public static void main(String[] args) {
		Set setEmployee = new HashSet();
		
		setEmployee.add(new Employee("abc",30));
		setEmployee.add(new Employee("abc",30));
		setEmployee.add(new Employee("abc",30));

		System.out.println(setEmployee.toString());
	}

}
