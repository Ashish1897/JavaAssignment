package assign;

import java.util.ArrayList;
import java.util.List;

public class String1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> numeric = new ArrayList<>();
		numeric.add("101");
		numeric.add("231");
		numeric.add("123");
		numeric.add("011");
		numeric.add("313");
		System.out.println("Numbers Starting with 1: ");
		numeric.stream().filter((s) -> s.startsWith("1")).forEach(i -> System.out.println(i));

	}

}
