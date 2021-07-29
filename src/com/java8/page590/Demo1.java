package com.java8.page590;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.Stack;
import java.util.stream.Collectors;

public class Demo1 {
	public static void main(String[] args) {
		Person beth = new Person("Beth",30);
		Person eric = new Person("Eric",31);
		Person deb = new Person("Deb",31);
		Person liz = new Person("Liz",30);
		Person wendi = new Person("Wendi",34);
		Person kathy = new Person("Kathy",35);
		Person bert = new Person("Bert",32);
		Person bill = new Person("Bill",34);
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
		
		
		List<Person> peopleAge34 = 
				people.stream()
					.filter(person -> person.getAge() == 34 )
					.collect(Collectors.toCollection(Stack::new));
		
		
		
		
		
		System.out.println(peopleAge34);
		
		System.out.println(peopleAge34 instanceof LinkedList);
		
		//Collectors.toList() arraylist will come, Collectors.toCollection(LinkedList::new) 
		
		Map<Integer , List<Person>> peopleByAge =
				people.stream()
					.collect(Collectors.groupingBy(Person::getAge));
		
		Map<Integer , Long> numberOfPeopleWithAge =
				people.stream()
					.collect(Collectors.groupingBy(Person::getAge , Collectors.counting()));
		System.out.println(peopleByAge+"\n"+numberOfPeopleWithAge);
		
		//.collect(   Collectors.groupingBy(Person::getAge))  , groupingBy(Person::getAge,Collectors.counting())
		
		
		Map<Integer,List<String>> namesByAge =
				people.stream()
					.collect(Collectors.groupingBy(
								Person::getAge,
								Collectors.mapping(Person::getName, Collectors.toList())
							)); 
		System.out.println(namesByAge);
		
		Map<Boolean , List<Person>> peopleOlderThan34 =
				people.stream()
					.collect(Collectors.partitioningBy(p -> p.getAge() > 34));
		System.out.println(peopleOlderThan34);
		
		
					
		Map<String, Integer> sumOfBAges =
				people.stream()
					.filter(p-> p.getName().startsWith("B"))
					.collect(Collectors.groupingBy(Person::getName, Collectors.summingInt(Person::getAge)));
		
		System.out.println(sumOfBAges);
		
		Map<String,Double> avgOfBAges =
				people.stream()
					.filter(p->p.getName().startsWith("B"))
					.collect(Collectors.groupingBy(Person::getName,Collectors.averagingInt(Person::getAge)));
		System.out.println(avgOfBAges);
		
		
		
		Long n = people.stream().collect(Collectors.counting());
		System.out.println(n);
		
		
		///////////////////////////////////////////////////////////////////////////////
		
		String older34 =
				people.stream()
					.filter(p->p.getAge()>34)
					.map(Person::getName)
					.collect(Collectors.joining(","));
		System.out.println(older34);
		
		
		Optional<Person> oldestPerson=
				people.stream()
					.collect(Collectors.maxBy((p1,p2)->p1.getAge()-p2.getAge()));
		oldestPerson.ifPresent(System.out::println);
		
		
		OptionalInt oldest2ndAp = people.stream().mapToInt(Person::getAge).max();
		oldest2ndAp.ifPresent(System.out::println);
		
		
				
				
				
		
		
		
		
		
		
		
		
		
		
		
	}
}
