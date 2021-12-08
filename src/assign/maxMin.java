package assign;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class maxMin {

	public static void main(String[] args) {
		
		List<Integer> num = new ArrayList<Integer>();
		num.add(101);
		num.add(88);
		num.add(10);
		num.add(43);
		num.add(56);
		
		
		int s=num.stream().mapToInt(i -> i).sum();
		System.out.println("Sum :" + s);
		
		int m=num.stream().mapToInt(i -> i).min().orElse(0);
		System.out.println("minimum :" + m);
		
		int ma=num.stream().mapToInt(i -> i).max().orElse(0);
		System.out.println("maximum :" + ma);
		
		double av=num.stream().mapToInt(i -> i).average().orElse(0);
		System.out.println("average :" + av);
		
			

	}

}
