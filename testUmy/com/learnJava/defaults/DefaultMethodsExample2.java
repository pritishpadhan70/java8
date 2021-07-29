package com.learnJava.defaults;

import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

public class DefaultMethodsExample2 {
	static Consumer<Student> studentConsumer = System.out::println;
	static Comparator<Student> nameComparator = Comparator.comparingDouble(Student::getGpa);
	static Comparator<Student> gradeComparator = Comparator.comparingInt(Student::getGradeLevel);
	
	public static void sortByName(List<Student> studentList) {
		System.out.println("After SortByName");
		studentList.sort(nameComparator);
		studentList.forEach(studentConsumer);
	}
	
	public static void sortByGpa(List<Student> studentList) {
		System.out.println("After SortByGpa");		
		studentList.sort(nameComparator);
		studentList.forEach(studentConsumer);
	}
	
	public static void comparatorChaining(List<Student> studentList) {
		
		System.out.println("After comparator chaining.");
		studentList.sort(gradeComparator.thenComparing(nameComparator));
		studentList.forEach(studentConsumer);
	}
	
	public static void sortWithNullValues(List<Student> studentList) {
		System.out.println("After sortwith null values ");
		Comparator<Student> studentComparator = Comparator.nullsLast(nameComparator);
		studentList.sort(studentComparator);
		studentList.forEach(studentConsumer);
		
	}
	
	public static void main(String[] args) {
		
		List<Student> studentList = StudentDataBase.getAllStudents();
		System.out.println("Before Sort");
		studentList.forEach(studentConsumer);
		
		//sortByName(studentList);
		//sortByGpa(studentList);
		//comparatorChaining(studentList);
		sortWithNullValues(studentList);
	}
}
