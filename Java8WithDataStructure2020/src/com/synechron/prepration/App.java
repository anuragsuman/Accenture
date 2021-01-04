package com.synechron.prepration;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * Java Program to demonstrate that making all
 * fields final doesn't make a class Immutable.
 * You can still break immutability if you return
 * reference to mutable objects to client.
 * 
 * @author WINDOWS 8
 *
 */
public class App {  

	public static void main(String args[]) {
		Calendar cal = Calendar.getInstance();
		cal.set(1982, 4, 21);
		Date birthDate = cal.getTime();

		List hobbies = new ArrayList<>();     
		hobbies.add("Painting");
		hobbies.add("Travelling");
		hobbies.add("Fitness");

		Person robin = new Person("Robin", birthDate, hobbies);
		System.out.println("Before");
		System.out.println(robin);

		// if it's immutable you can't change the object
		Date birthday = robin.getBirthday();
		birthday.setTime(System.currentTimeMillis());

		List originalHobbies = robin.getHobbies();
		originalHobbies.remove(0);
		originalHobbies.remove(0);

		System.out.println("After");
		System.out.println(robin);

	}

}

class Person{
	private final String name;
	private final Date birthday;
	private final List hobbies;

	public Person(String name, Date birthday, List hobbies){
		this.name = name;
		this.birthday = birthday;
		this.hobbies = hobbies;
	}
	public String getName() {
		return name;
	}
	public Date getBirthday() {
		return birthday;
	}
	public List getHobbies() {
		return hobbies;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", birthday=" + birthday + ", hobbies="
				+ hobbies + "]";
	}
}