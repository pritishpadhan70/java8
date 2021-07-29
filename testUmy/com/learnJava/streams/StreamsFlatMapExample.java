package com.learnJava.streams;

import java.util.List;
import java.util.stream.Collectors;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

public class StreamsFlatMapExample {
	
	public static List<String> printStudentActivities(){
		List<String> studentActivities = StudentDataBase.getAllStudents().stream() //Stream<Student>
			.map(Student::getActivities)//Stream<List<String>>
			.flatMap(List::stream)//Stream<String>
			.distinct()
			.sorted()
			.collect(Collectors.toList());
		
		return studentActivities;
	}
	
	public static long printStudentActivitiesCount(){
		long numberOfStudentActivities = StudentDataBase.getAllStudents().stream() //Stream<Student>
			.map(Student::getActivities)//Stream<List<String>>
			.flatMap(List::stream)//Stream<String>
			.distinct()
			.count();
		
		return numberOfStudentActivities;
	}
	
	public static void main(String[] args) {
		System.out.println("printStudentActivities: "+printStudentActivities());
		System.out.println("printStudentActivitiesCount: "+printStudentActivitiesCount());
	}
}
