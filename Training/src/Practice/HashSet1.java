package Practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashSet1 {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<>();
		set.add("One");
		set.add("Two");
		set.add("Nine");
		set.add("Four");
		set.add(null);
		set.add("Eight");
		
		Iterator<String> itr = set.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}
		
		// Elements are unordered because
		// HashSet uses HashTable for storage.
		// Elements are placed in HashTable based on their HashCodes.
		
		System.out.println("\nset.remove(\"Nine\") : "+set.remove("Nine"));
		
		ArrayList<String> arr = new ArrayList<>();
		arr.add("Twenty");
		arr.add("Twentyfive");
		arr.add("Forty");
		arr.add("Fifty");
		System.out.println("arr : "+arr);
		System.out.println("set.addAll(arr) : "+set.addAll(arr));
		System.out.println("set : "+set);
	}
}
