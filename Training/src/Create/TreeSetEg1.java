package Create;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class TreeSetEg1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of elements: ");
		int num = sc.nextInt();
		ArrayList<Integer> arr = new ArrayList<>();
		for(int i=0;i<num;i++) {
			arr.add(sc.nextInt());
		}
		System.out.println("Elements entered: "+arr);
		TreeSet<Integer> tree = new TreeSet<>(arr);
		System.out.println("Sorted elements: "+tree);
		System.out.println("Using Iterator - .hasNext() and .next(): ");
		Iterator<Integer> itr = tree.iterator();
		while (itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}
	}
}
