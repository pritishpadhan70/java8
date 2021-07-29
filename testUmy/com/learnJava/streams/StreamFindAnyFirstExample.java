package com.learnJava.streams;

import java.util.Optional;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

public class StreamFindAnyFirstExample {
	
	public static Optional<Student> findAnyStudent(){
		return StudentDataBase.getAllStudents().stream()
				.filter(student->student.getGpa()>=3.9)
				.findAny();// if finds any student at first then don't proceed further.
	}
	
	public static Optional<Student> findFirstStudent(){
		return StudentDataBase.getAllStudents().stream()
				.filter(student->student.getGpa()>=3.9)
				.findFirst();// if finds any student at first then don't proceed further.
	}
	
	// diff is in parallel stream case findFirst and findAny
	
	public static void main(String[] args) {
		Optional<Student> studentOptionalFindAny = findAnyStudent();
		if(studentOptionalFindAny.isPresent()) {
			System.out.println("Found the student : "+studentOptionalFindAny.get());
		}else {
			System.out.println("Student not found ");
		}
		
		Optional<Student> studentOptionalFindFirst = findFirstStudent();
		if(studentOptionalFindFirst.isPresent()) {
			System.out.println("Found the student : "+studentOptionalFindFirst.get());
		}else {
			System.out.println("Student not found ");
		}
	}
	
}
