package streams.com_1.java8.page542;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Demo2 {
	public static void main(String[] args) {
		List<String> names = 
				Arrays.asList("Boi","Charis","Zooey","Bokeh","Clover","Aiko");
		names.stream()
			.filter(s->s.startsWith("B")||s.startsWith("C"))
			.filter(s-> s.length() > 3)
			.forEach(System.out::println);
		
		List<Integer> nums = Arrays.asList(1,2,3,4,5,6);
		long result = nums.stream()
				.map(n-> n*n)
				.filter(n-> n>20)
				.count();
		System.out.println("Result (stream): "+result);
			
		long res = nums.stream()
				.peek(n->System.out.print("Number is : "+n+", "))
				.map(n->n*n)
				.filter(n-> n>20)
				.peek(n->System.out.print("Square is : "+n+", "))
				.count();
		System.out.println(res);
		
		Stream.of("Zerry","Ketty","Cilly","Aeryn")
			.sorted()
			.forEach(System.out::println);
		
		List<Duck> ducks = Arrays.asList(
					new Duck("Jerry", "yellow", 3),
					new Duck("George", "brown", 4),
					new Duck("Kramer", "mottled", 6),
					new Duck("Elaine","white",2)
				);
		ducks.stream()
			.sorted()
			.forEach(System.out::println);
	}
}

//security auth authorization : spring angular exception handle,immutable. module to module conversation
//code coverage 80%