package Create;

import java.util.ArrayList;
import java.util.List;

public class ListOfLists {

	public static void main(String[] args) {
		List<List<String>> listOfLists = new ArrayList<>();
		List<String> list1 = new ArrayList<>();
		list1.add("Apple");
		list1.add("Banana");
		list1.add("Orange");
		List<String> list2 = new ArrayList<>();
		list1.add("Dog");
		list1.add("Cat");
		list1.add("Bird");
		listOfLists.add(list1);
		listOfLists.add(list2);
		System.out.println(listOfLists.get(0));
	}

}
