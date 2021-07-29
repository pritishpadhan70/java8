package com.java8.page590;

import java.util.LinkedList;
import java.util.List;

public class PersonUtils {
	public static List<Person> getList() {
		Person beth = new Person("Beth",30);
		Person beth2 = new Person("Beth",45);		
		Person bert2 = new Person("Bert",38);
		Person eric = new Person("Eric",31);
		Person deb = new Person("Deb",31);
		Person liz = new Person("Liz",30);
		Person wendi = new Person("Wendi",34);
		Person kathy = new Person("Kathy",35);
		Person bert = new Person("Bert",32);
		Person bill = new Person("Bill",34);
		Person bill2 = new Person("Bill",40);
		Person robert = new Person("Robert",38);
		
		List<Person> people = new LinkedList<Person>();
		people.add(beth);
		people.add(eric);
		people.add(deb);
		people.add(liz);
		people.add(wendi);
		people.add(kathy);
		people.add(bert);
		people.add(bill);
		people.add(robert);
		people.add(bill2);
		people.add(beth2);
		people.add(bert2);
		
		return people;
	}
}
