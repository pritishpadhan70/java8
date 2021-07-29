package streams.com_1.java8.page542;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class Demo1 {
	public static void main(String[] args) {
		Integer[] myNums = {1,2,3};
		Stream<Integer> myStream = Arrays.stream(myNums);
		long numElements = myStream.count();
		System.out.println("Num of Elems : "+numElements);
		//We can't reuse streams. need to create new stream
		Stream<Integer> myStream2 = Arrays.stream(myNums);
		long numElementsGrtThan1 =
				myStream2.filter(i -> i>1)
				.count();
		System.out.println("Grt than 1 : "+numElementsGrtThan1);
		
		//create a stream of collection
		List<Double> tempInMall = Arrays.asList(123.6,118.0,113.0,112.5,115.8,117.0,110.2,110.1,106.0,106.4);
		System.out.println("over 110 temp: "
								+ tempInMall.stream()
										.filter(t->t>110.0)
										.count());
		
		//stream() method is a default method of Collection interface 
		//All Collection classes only can use stream() method. no map classes
		
		Map<String, Integer> myMap = new HashMap<String,Integer>();
		myMap.put("Boi", 6);
		myMap.put("Zooey", 3);
		myMap.put("Charis", 8);
		
		System.out.println("Num of items with val > 4 : "+
							myMap.entrySet()
								.stream()
								.filter(es-> es.getValue() > 4)
								.count());
		
		//Build a Stream with Stream.of()
		
		Integer[] nums = {1,2,3};
		Stream<Integer> nStream = Stream.of(nums);
		
		Stream<Integer> nStream2 = Stream.of(1,2,3);
		
		String[] dogs = {"Boi","Zooey","Charis"};
		Stream<String> dogStream = Arrays.stream(dogs);
		
		Stream<String> dogStream2 = Stream.of(dogs);
		
		
		
		
		
		
		
		
		
	}
}
