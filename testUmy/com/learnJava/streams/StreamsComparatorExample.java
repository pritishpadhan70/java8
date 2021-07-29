package com.learnJava.streams;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

public class StreamsComparatorExample {
	
	public static List<Student> sortStudentsByName(){
		return StudentDataBase.getAllStudents()
			.stream()
			.sorted(Comparator.comparing(Student::getName))
			.collect(Collectors.toList());
	}
	
	public static List<Student> sortStudentsByGpa(){
		return StudentDataBase.getAllStudents()
			.stream()
			.sorted(Comparator.comparing(Student::getGpa))
			.collect(Collectors.toList());
	}
	
	public static List<Student> sortStudentsByGpaDesc(){
		return StudentDataBase.getAllStudents()
			.stream()
			.sorted(Comparator.comparing(Student::getGpa).reversed())
			.collect(Collectors.toList());
	}
	
	public static void main(String[] args) {
		System.out.println("Students sorted by gpa: ");
		sortStudentsByGpaDesc().forEach(System.out::println);
	}
}
