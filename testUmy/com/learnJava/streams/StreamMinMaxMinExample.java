package com.learnJava.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamMinMaxMinExample {

	public static int maxValue(List<Integer> integerList) {
		return integerList.stream().reduce(Integer.MIN_VALUE, (i1, i2) -> i1 > i2 ? i1 : i2);
	}

	public static Optional<Integer> maxValueOptional(List<Integer> integerList) {
		return integerList.stream().reduce((i1, i2) -> i1 > i2 ? i1 : i2);
	}

	public static int minValue(List<Integer> integerList) {
		return integerList.stream().reduce(Integer.MAX_VALUE, (i1, i2) -> i1 < i2 ? i1 : i2);
	}

	public static Optional<Integer> minValueOptional(List<Integer> integerList) {
		return integerList.stream().reduce((i1, i2) -> i1 < i2 ? i1 : i2);
	}

	public static void main(String[] args) {
		List<Integer> integerList = Arrays.asList(6, 7, 12, 5, 10, 9);
		System.out.println(maxValue(integerList));

		Optional<Integer> maxValueOpt = maxValueOptional(integerList);
		if (maxValueOpt.isPresent()) {
			System.out.println(maxValueOpt.get());
		} else {
			System.out.println("Input List is empty. ");
		}

		System.out.println(minValue(integerList));

		Optional<Integer> minValueOpt = minValueOptional(integerList);
		if (minValueOpt.isPresent()) {
			System.out.println(minValueOpt.get());
		} else {
			System.out.println("Input List is empty. ");
		}

	}
}
