package com.learnJava.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

public class StreamReduceExample {
	public static int performMultiplication(List<Integer> integerList) {
		
		return integerList.stream()
				//a =1 start , b = 1 from stream > result 1 is returned
				//a =1 , b = 3 from stream => result 3 is returned
			.reduce(1,(a,b) -> a*b);
		
		
	}
	
	public static Optional<Integer> performMultiplicationWithoutIdentity(List<Integer> integerList) {
		
		return integerList.stream()
				//a =1 start , b = 1 from stream > result 1 is returned
				//a =1 , b = 3 from stream => result 3 is returned
			.reduce((a,b) -> a*b);
		
		
	}
	
	public static Optional<Student> getHighestGPAStudent(){
		return StudentDataBase.getAllStudents().stream()
			.reduce((s1,s2)-> s1.getGpa()>s2.getGpa() ? s1:s2);
	}
	
	
	public static void main(String[] args) {
		
		List<Integer> integers = Arrays.asList(1,3,5,7);
		System.out.println(performMultiplication(integers));
		
		System.out.println();
		
		List<String> names = Arrays.asList("Divya","Bikas","Abhas","Neba");
		Optional<String> opt = names.stream()
			.reduce((a,b)->a+","+b);
			
		System.out.println(opt.get());
		
		Optional<Integer> result = performMultiplicationWithoutIdentity(integers);
		if(result.isPresent()) {
			System.out.println(result.get());
		}
		
		Optional<Integer> result1 = performMultiplicationWithoutIdentity(new ArrayList<Integer>());
		if(result1.isPresent()) {
			System.out.println(result1.get());
		}
		
		
		Optional<Student> studentOptional = getHighestGPAStudent();
		if(studentOptional.isPresent()) {
			System.out.println(studentOptional.get());
		}
	}
}
