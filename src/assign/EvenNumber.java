package assign;

import java.util.stream.Stream;

public class EvenNumber {
	
	public static void main(String[] args) {
		Integer [] number = {12, 34,57,67,98};
		
		Stream<Integer> st = Stream.of(number);
		
		System.out.println("Even Numbers: ");
		st.filter(i->i%2==0).forEach(i -> System.out.println(i));
		
	}

}
