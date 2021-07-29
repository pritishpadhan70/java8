package com.learnJava.streams;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

public class StreamsExample {
	public static void main(String[] args) {
		Predicate<Student> studentPredicate = (student -> student.getGradeLevel()>=3);
		Predicate<Student> studentgpaPredicate = (student -> student.getGpa()>=3.9);
		
		Map<String,List<String>> studentMap = StudentDataBase.getAllStudents().stream()
				.peek(System.out::println)
				.filter(studentPredicate)
				.peek(student -> System.out.println("after 1st filter : "+student))
				.filter(studentgpaPredicate)
				.peek(student -> System.out.println("after 2nd filter : "+student))
				.collect(Collectors.toMap(Student::getName,Student::getActivities));
		
		System.out.println(studentMap);
	}
}
