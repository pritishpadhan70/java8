package streams.com_1.java8.page542;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Demo3 {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5,6);
		
		
		Iterator<Integer> itr = list.iterator();
		while(itr.hasNext()) {
			list.add(1);
			if(itr.next()==3)
			list.remove(2);
		}
	}
}
