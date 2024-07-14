package Practice;

//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.Comparator;
import java.util.LinkedHashSet;
//import java.util.List;

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
//		List<String> list = new ArrayList<>(set);
//		Collections.sort(set, Comparator.nullsFirst(Comparator.naturalOrder()));
	}

}
