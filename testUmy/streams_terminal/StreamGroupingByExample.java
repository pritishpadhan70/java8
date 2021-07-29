package streams_terminal;

import static java.util.stream.Collectors.collectingAndThen;
import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.maxBy;
import static java.util.stream.Collectors.summingInt;
import static java.util.stream.Collectors.*;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

public class StreamGroupingByExample {
	
	public static void groupStudentsByGender() {
		Map<String,List<Student>> studentMap = StudentDataBase.getAllStudents()
			.stream()
			.collect(groupingBy(Student::getGender));
		System.out.println(studentMap);
	}
	
	public static void customizedGroupingBy() {
		Map<String,List<Student>> studentMap = StudentDataBase.getAllStudents()
			.stream()
			.collect(groupingBy(student->student.getGpa()>=3.8 ? "OUTSTANDING":"AVERAGE"));
		System.out.println(studentMap);
	}
	//2 arguments version
	public static void twoLevelGrouping_1() {
		Map<Integer,Map<String,List<Student>>> studentMap =  StudentDataBase.getAllStudents()
			.stream()
			.collect(groupingBy(Student::getGradeLevel,
						groupingBy(student->student.getGpa()>=3.8 ? "OUTSTANDING":"AVERAGE")
					));
		System.out.println(studentMap);
	}
	
	public static void twoLevelGrouping_2() {
		Map<Integer,Integer> studentMap =  StudentDataBase.getAllStudents()
			.stream()
			.collect(groupingBy(Student::getGradeLevel,
						summingInt(Student::getNoteBooks)
					));
		System.out.println(studentMap);
	}
	
	public static void threeArgumentGroupBy() {
		LinkedHashMap<String,Set<Student>> studentLinkedHashMap =
				 StudentDataBase.getAllStudents()
				.stream()
				.collect(groupingBy(Student::getName,LinkedHashMap::new,toSet()));
		System.out.println(studentLinkedHashMap);
	}
	
	
	public static void calculateTopGpa() {
		Map<Integer, Optional<Student>> studentMapOptional = StudentDataBase.getAllStudents()
			.stream()
			.collect(groupingBy(Student::getGradeLevel , maxBy(Comparator.comparing(Student::getGpa))));
		//System.out.println(studentMapOptional);
		
		Map<Integer, Student> studentMapOptional1 = StudentDataBase.getAllStudents()
				.stream()
				.collect(groupingBy(Student::getGradeLevel , 
						collectingAndThen(
						maxBy(Comparator.comparing(Student::getGpa)),Optional::get))
						);
		System.out.println(studentMapOptional1);
	}
	
	public static void calculateLeastGpa() {
		Map<Integer, Optional<Student>> studentMapOptional = StudentDataBase.getAllStudents()
			.stream()
			.collect(groupingBy(Student::getGradeLevel , minBy(Comparator.comparing(Student::getGpa))));
		//System.out.println(studentMapOptional);
		
		Map<Integer, Student> studentMapOptional1 = StudentDataBase.getAllStudents()
				.stream()
				.collect(groupingBy(Student::getGradeLevel , 
						collectingAndThen(
						minBy(Comparator.comparing(Student::getGpa)),Optional::get))
						);
		System.out.println(studentMapOptional1);
	}
	
	public static void main(String[] args) {
		//groupStudentsByGender();
		//customizedGroupingBy();
		//twoLevelGrouping_1();
		//twoLevelGrouping_2();
		//threeArgumentGroupBy();
		//calculateTopGpa();
		calculateLeastGpa();
	}
}
