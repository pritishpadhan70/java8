package com.learnJava.numericstreams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NumericStreamMapExample {
	
	public static List<Integer> mapToObj() {
		return IntStream.rangeClosed(1, 5)
			.mapToObj(i->new Integer(i))
			.collect(Collectors.toList());
	}
	
	public static long mapToLong() {
		return IntStream.rangeClosed(1, 5)
		//i passed from the intstream
			.mapToLong(i->i)//converts intstream to longstream
			.sum();
	}
	
	public static double mapToDouble() {
		return IntStream.rangeClosed(1, 5)
		//i passed from the intstream
			.mapToDouble(i->i)//converts intstream to longstream
			.sum();
	}
	
	public static void main(String[] args) {
		System.out.println("map to Obj : "+mapToObj());
		System.out.println("map to Long : "+mapToLong());
		System.out.println("map to Double : "+mapToDouble());
	}
}
