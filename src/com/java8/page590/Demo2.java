package com.java8.page590;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Demo2 {
	public static void main(String[] args) {
		List<Person> people = PersonUtils.getList();
		List<Person> list34Age = people.stream().filter(p -> p.getAge() == 34).collect(Collectors.toList());
		list34Age.stream().forEach(System.out::println);

		List<Person> list34Age2 = people.stream().filter(p -> p.getAge() == 34)
				.collect(Collectors.toCollection(LinkedList::new));
		list34Age2.stream().forEach(System.out::println);

		Map<Integer, List<Person>> pByAge = people.stream().collect(Collectors.groupingBy(Person::getAge));

		System.out.println(pByAge);

		Map<Integer, List<String>> map = people.stream().collect(
				Collectors.groupingBy(Person::getAge, Collectors.mapping(Person::getName, Collectors.toList())));
		System.out.println(map);

		Map<Integer, Long> numPAge = people.stream()
				.collect(Collectors.groupingBy(Person::getAge, Collectors.counting()));
		System.out.println(numPAge);

		Map<Boolean, List<Person>> older34 = people.stream().collect(Collectors.partitioningBy(p -> p.getAge() > 34));
		System.out.println(older34);

		Map<String, Integer> sumBAges = people.stream()
				.filter(p->p.getName().startsWith("B"))
				.collect(Collectors.groupingBy(Person::getName, Collectors.summingInt(Person::getAge)));
		System.out.println(sumBAges);
	}
}
