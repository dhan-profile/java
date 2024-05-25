package Practice;

//import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet1 {

	public static void main(String[] args) {
		TreeSet<String> tree = new TreeSet<>();
		tree.add("one");
		tree.add("Two");
		tree.add("Three");
		tree.add("Four");
		System.out.println("tree : "+ tree);
//		Iterator itr = tree.descendingIterator();
		System.out.println(tree);
		
		TreeSet<Integer> set= new TreeSet<>();
		set.add(5);
		set.add(3);
		set.add(25);
		set.add(75);
		set.add(55);
		set.add(15);
		System.out.println("set : "+set);
		System.out.println("set.pollFirst() : "+set.pollFirst());
		System.out.println("set.pollLast() : "+set.pollLast());
		System.out.println("set : "+set);
		System.out.println("set.descendingSet() : "+set.descendingSet());
		System.out.println("set.headSet(25) : "+set.headSet(25));
		System.out.println("set.headSet(25, true) : "+set.headSet(25, true));
		System.out.println("set.subSet(5, false, 25, true) : "+set.subSet(5, false, 25, true));
		System.out.println("set.subSet(5, true, 25, true) : "+set.subSet(5, true, 25, true));
		System.out.println("set.tailSet(25, true) : "+set.tailSet(25, true));
	}

}
