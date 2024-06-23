package Programs;

import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class ReverseListIterator {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("Apple", "Banana", "Cherry", "Dates", "Elderberry");
		System.out.println(list);
		
		System.out.println("Reversed: ");
		System.out.println("=========");
		ListIterator<String> listModified = list.listIterator(list.size());
		while(listModified.hasPrevious()) {
			System.out.println(listModified.previous());
		}
	}

}
