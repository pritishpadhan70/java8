package parallelstream;

import java.util.List;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;
import static java.util.stream.Collectors.*;

public class ParallelStreamExmaple1 {
	
	public static List<String> sequentialPrintStudentActivities(){
		
		long startTime = System.currentTimeMillis();
		List<String> studentActivities = StudentDataBase.getAllStudents().stream()
				.map(Student::getActivities)
				.flatMap(List::stream)
				.distinct()
				.sorted()
				.collect(toList());
		long endTime = System.currentTimeMillis();
		System.out.println("Duration to execute the pipeline in sequential : "+(endTime-startTime));
		return studentActivities;
	}
	
	public static List<String> parallelPrintStudentActivities(){
		
		long startTime = System.currentTimeMillis();
		List<String> studentActivities = StudentDataBase.getAllStudents().stream()
				.parallel()
				.map(Student::getActivities)
				.flatMap(List::stream)
				.distinct()
				.sorted()
				.collect(toList());
		long endTime = System.currentTimeMillis();
		System.out.println("Duration to execute the pipeline in parallel : "+(endTime-startTime));
		
		return studentActivities;
	}
	
	
	public static void main(String[] args) {
		sequentialPrintStudentActivities();
		parallelPrintStudentActivities();
	}
}
