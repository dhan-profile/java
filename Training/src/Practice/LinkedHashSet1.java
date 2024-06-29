package Practice;

import java.util.LinkedHashSet;

public class LinkedHashSet1 {

	public static void main(String[] args) {
		LinkedHashSet<String> set = new LinkedHashSet<>();
		set.add("One");
		set.add("Two");
		set.add("Three");
		set.add(null);
		set.add("Four");
		set.add("Four");
		System.out.println("set : "+set);
		System.out.println("set.remove(\"Four\") : "+set.remove("Four"));
		System.out.println("set : "+set);
//		System.out.println("set.getFirst() : "+set.getFirst());
	}

}
