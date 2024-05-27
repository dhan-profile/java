package Practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
//import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet1 {

	public static void main(String[] args) {
		TreeSet<String> tree = new TreeSet<>();
		tree.add("1one");
		tree.add("3two");
		tree.add("2three");
		tree.add("5four");
		System.out.println("tree : "+ tree);
		Iterator<String> itr = tree.descendingIterator();
		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}
		
		System.out.println(tree);
		
		TreeSet<Integer> set= new TreeSet<>();
		set.add(5);
		set.add(3);
		set.add(25);
		set.add(75);
		set.add(55);
		set.add(15);
		System.out.println("set : "+set);
		System.out.println("set.first() : "+set.first());
		System.out.println("set.clone() : "+set.clone());
		System.out.println("set.ceiling(70) : "+set.ceiling(70));
		System.out.println("set.pollFirst() : "+set.pollFirst());
		System.out.println("set.pollLast() : "+set.pollLast());
		System.out.println("set : "+set);
		System.out.println("set.descendingSet() : "+set.descendingSet());
		System.out.println("set.headSet(25) : "+set.headSet(25));
		System.out.println("set.headSet(25, true) : "+set.headSet(25, true));
		System.out.println("set.subSet(5, false, 25, true) : "+set.subSet(5, false, 25, true));
		System.out.println("set.subSet(5, true, 25, true) : "+set.subSet(5, true, 25, true));
		System.out.println("set.tailSet(25, true) : "+set.tailSet(25, true));
		
		ArrayList<Integer> lin = new ArrayList(set);
		System.out.println(lin);
//		ListIterator<Integer> li = lin.listIterator(lin.size());
		ListIterator<Integer> li = lin.listIterator();
		while(li.hasNext()) {
			System.out.print(li.next()+" ");
		}
	}

}
