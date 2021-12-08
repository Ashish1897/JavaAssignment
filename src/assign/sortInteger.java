package assign;

import java.util.stream.Stream;

public class sortInteger {

	public static void main(String[] args) {
		
        Integer [] number = {12,849,3,53,101,34,57,67,98};
		
		Stream<Integer> jk = Stream.of(number);
		
		System.out.println("Sorted list: ");
		jk.sorted().forEach(i -> System.out.println(i));
			

	}

}
