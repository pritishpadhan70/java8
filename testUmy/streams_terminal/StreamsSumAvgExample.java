package streams_terminal;

import java.util.stream.Collectors;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

public class StreamsSumAvgExample {
	public static int sum() {
		return StudentDataBase.getAllStudents().stream().collect(Collectors.summingInt(Student::getNoteBooks));
	}

	public static double average() {
		return StudentDataBase.getAllStudents()
			.stream()
			.collect(Collectors.averagingInt(Student::getNoteBooks));
	}
	
	public static void main(String[] args) {
		System.out.println(sum());
		System.out.println(average());

	}
}
