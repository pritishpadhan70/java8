package com.learnJava.streams;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

public class StreamsMapExample {
	
	public static List<String> namesList(){
		
		List<String> studentList = StudentDataBase.getAllStudents().stream()
			//Student as input , output is student name
			.map(Student::getName)
			.map(String::toUpperCase)
			.collect(Collectors.toList());
		return studentList;
	}
	
public static Set<String> namesSet(){
		
		Set<String> studentSet = StudentDataBase.getAllStudents().stream()
			//Student as input , output is student name
			.map(Student::getName)
			.map(String::toUpperCase)
			.collect(Collectors.toSet());
		return studentSet;
	}
	
	public static void main(String[] args) {
		System.out.println(namesList());
		System.out.println(namesSet());
	}
}
