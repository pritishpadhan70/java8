package com.java8.page590;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DemoEmp {
	public static void main(String[] args) {
		
		
		ArrayList<Emp> empList = (ArrayList<Emp>) Arrays.asList(
				 new Emp(120.9, "hr", "Cerry"),
				 new Emp(80.0, "it", "Telly"),
				 new Emp(300.9, "hr", "Bony"),
				 new Emp(90.9, "finance", "Alex")
				);
		
		System.out.println("LL ");
		
		Map<String,List<Double>> map = 
				empList.stream()
					.collect(Collectors.groupingBy(
								Emp::getDept,
								Collectors.mapping(Emp::getSal, Collectors.toList())
							));
		System.out.println(map);
		
		/*
		 * Stream.of(1,2,3,4,5,6,7,410) .filter(e->e%10==0) .max((n1,n2)->n1-n2)
		 * .ifPresentOrElse(System.out::println, ()->System.out.println("No elem"));
		 */
	
		
		
		
		
	}
}
