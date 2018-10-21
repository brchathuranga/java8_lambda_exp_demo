package com.lambda.exercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Excercise {

	public static void main(String[] args) {

		List<Person> people = Arrays.asList(
				new Person("Ruwan", "Chathuranga", 30),
				new Person("abc", "xyz", 12)
		);
		
	/*	Collections.sort(people, new Comparator<Person>() {
			@Override
			public int compare(Person o1, Person o2) {
				return o1.getLastName().compareTo(o2.getLastName());
			}
		});*/
		
		Collections.sort(people, (Person p1, Person p2) -> p1.getLastName().compareTo(p2.getLastName())); 
		
		people.sort((Person o1, Person o2) -> o1.getLastName().compareTo(o2.getLastName()));

		people.forEach((person) -> System.out.println(person.getLastName()));
		
		
	}

}
