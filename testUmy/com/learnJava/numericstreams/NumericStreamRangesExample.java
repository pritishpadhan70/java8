package com.learnJava.numericstreams;

import java.util.stream.IntStream;

public class NumericStreamRangesExample {
	public static void main(String[] args) {
		long count = IntStream.range(1, 50).count();
		System.out.println(count);
		
		IntStream.range(1, 50).forEach(val->System.out.print(val+","));
		System.out.println();
		
		System.out.println(IntStream.rangeClosed(1, 50).count());
		
		IntStream.range(1, 50).asDoubleStream().forEach(System.out::println);
	}
}
