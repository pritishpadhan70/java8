package com.learnJava.defaults;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class DefaultMethodsExample {
	
	
	public static void main(String[] args) {
		
		List<String> stringList = Arrays.asList("Adam","Jenny","Alex","Dan","Mike","Eric");
		
		//prior java8
		
		//Collections.sort(stringList);
		//System.out.println("SortedList using Collections.sort() : "+stringList);
		
		//java8
		
		stringList.sort(Comparator.naturalOrder());
		System.out.println("SortedList using List.sort() : "+stringList);
		stringList.sort(Comparator.reverseOrder());
		System.out.println("Reversed SortedList using List.sort() : "+stringList);
	}
}
