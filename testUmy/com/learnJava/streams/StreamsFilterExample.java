package com.learnJava.streams;

import java.util.List;
import java.util.stream.Collectors;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

public class StreamsFilterExample {
	
	public static List<Student> filterStudents(){
		
		return StudentDataBase.getAllStudents().stream()
			.filter(student -> student.getGender().equals("female"))
			.filter(student -> student.getGpa()>=3.9)
			.collect(Collectors.toList());
	}
	
	public static void main(String[] args) {
		filterStudents().forEach(System.out::println);
	}
}
