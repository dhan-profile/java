package Practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayList2 {

	public static void main(String[] args) {
		ArrayList<Integer> arr1 = new ArrayList<>(); 
		arr1.add(32);
		arr1.add(12);
		arr1.add(null);
		arr1.add(64);
		arr1.add(47);
		arr1.add(null);
		arr1.add(5);
		System.out.println("arr1 : " + arr1);
		System.exit(0);
		
		System.out.println("arr1.isEmpty() : " + arr1.isEmpty());
		arr1.add(2, 25);
		System.out.println(arr1);
		System.out.println("arr1.get(1) : " + arr1.get(1));
		System.out.println("arr1.set(1,8) : " + arr1.set(1, 8));
		System.out.println("arr1.remove(2) : " + arr1.remove(2));
		System.out.println("arr1 : " + arr1);
		System.out.println("arr1.contains(12) : " + arr1.contains(12));
		arr1.ensureCapacity(20);
		System.out.println("arr1.size() : " + arr1.size());
		ArrayList<Integer> arr2 = new ArrayList<>();
		arr2.add(30);
		arr2.add(40);
		arr2.add(20);
		arr2.add(10);
		System.out.println("arr1.addAll(arr2) : " + arr1.addAll(arr2));
		System.out.println("arr1 : " + arr1);
		arr1.sort(null);
		System.out.println("After sorting : ");
		System.out.println("arr1 : " + arr1);
		System.out.println("arr1.removeAll(arr2) : " + arr1.removeAll(arr2));
		System.out.println("arr1 : " + arr1);
		ArrayList<String> arr3 = new ArrayList<>();
		arr3.add("Java");
		arr3.add("Programming");
		arr3.add("Hello");
		arr3.add("1");
		System.out.println(arr3);
		System.out.println("After sorting : ");
		Collections.sort(arr3);
		System.out.println(arr3);
		
		//arr3.remove(1);
		System.out.println("arr3.remove(1) : " + arr3.remove(1));
		System.out.println(arr3);
		
		Iterator<Integer> itr = arr1.iterator();
		System.out.println(itr.hasNext());
		while(itr.hasNext()){
			System.out.print(itr.next() + " ");
		}
		
		System.out.println("ListIterator:------");
		ListIterator<Integer> litr = arr1.listIterator();
		while(litr.hasNext()) {
			System.out.println(litr.next() + " " + litr.nextIndex());
			if(litr.nextIndex() == 5) {
				litr.set(6);
				litr.add(5);
			}
		}
		System.out.println(arr1);
					
		System.out.println("\nEnd");
	}

}
