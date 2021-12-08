package assign;

import java.util.stream.Stream;

public class TotalNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        Integer [] number = {12, 34,57,67,98};
		
		Stream<Integer> jk = Stream.of(number);
		
		long cnt = jk.count();
		
		System.out.println("Total Number in the array: " +cnt);
		
		

	}

}
