package Practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;

public class Manual {

	public static void main(String[] args) {
		List<Number> num = new ArrayList<>();
		Integer n = 5;
		Number n1 = 10;
		System.out.println(n);
		System.out.println(n1);
		num.add(n);
		num.add(n1);
		System.out.println(num);
		
		Random random = new Random(314L);
		Supplier<Integer> newRandom = () -> random.nextInt(10);

		for (int index = 0; index < 5; index++) {
		    System.out.println(newRandom.get() + " ");
		}

	}

}
