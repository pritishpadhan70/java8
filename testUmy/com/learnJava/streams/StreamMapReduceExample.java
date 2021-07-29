package com.learnJava.streams;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

public class StreamMapReduceExample {
	
	private static int noOfNoteBooks() {
		return StudentDataBase.getAllStudents().stream()
			.filter(student->student.getGradeLevel()>=3)
			.filter(student->student.getGender().equals("female"))
			.peek(System.out::println)
			.map(Student::getNoteBooks)
			.reduce(0,(a,b)->a+b);
	}
	
	private static int noOfNoteBooks2() {
		return StudentDataBase.getAllStudents().stream()
			.map(Student::getNoteBooks)
			.reduce(0, Integer::sum);
	}
	
	public static void main(String[] args) {
		System.out.println("Number of Note Books : "+noOfNoteBooks());
		System.out.println("Number of Note Books : "+noOfNoteBooks2());
	}
}
