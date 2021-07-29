package com.java8.pikun;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Test2 {
	public static void main(String[] args) {
		
		List<Integer> l = new ArrayList<Integer>();
		l.add(10);
		l.add(44);
		l.add(67);
		l.add(35);
		l.add(89);
		l.add(42);
		l.add(49);
		l.add(91);
		
		System.out.println(l);
		
//		List<Integer> evenList = l.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
//		System.out.println(evenList);
		
		l.stream().filter(i -> i > 40).forEach(System.out::println);
	}
}
