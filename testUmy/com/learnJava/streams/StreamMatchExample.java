package com.learnJava.streams;

import com.learnJava.data.StudentDataBase;

public class StreamMatchExample {
	
	public static boolean allMatch() {
		return StudentDataBase.getAllStudents().stream()
			.allMatch(student -> student.getGpa() >= 3.9);
	}
	
	public static boolean anyMatch() {
		return StudentDataBase.getAllStudents().stream()
			.anyMatch(student -> student.getGpa() >= 3.9);
	}
	
	public static boolean noneMatch() {
		return StudentDataBase.getAllStudents().stream()
			.noneMatch(student -> student.getGpa() >= 4.1);
	}
	
	public static void main(String[] args) {
		System.out.println("All Match Gpa >= 3.9 "+allMatch());
		System.out.println("Any Match Gpa >= 3.9 "+anyMatch());
		System.out.println("None Match Gpa >= 4.1 "+noneMatch());
	}
}
