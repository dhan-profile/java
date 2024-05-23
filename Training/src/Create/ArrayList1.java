package Create;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

interface List1 {
	void display();
}

class Parent {
	public void viewParent() {
		System.out.println("Parent Class Method");
	}
}

class Child extends Parent {
	public void viewChild() {
		System.out.println("Child Class Method");
	}
}

public class ArrayList1 implements List1 {

	ArrayList1() {
		System.out.println("Constructor block");
	}

	static {
		System.out.println("Static Block");
	}

	public void display() {
		System.out.println("Interface Method - Abstract");
	}

	public static void main(String[] args) {
		ArrayList1 inObj = new ArrayList1();
		inObj.display();
		ArrayList1 obj = new ArrayList1();
		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(10);
		arr.add(20);
		arr.add(30);
		arr.add(40);
		System.out.println(arr);

		System.out.println("arr.isEmpty() : " + arr.isEmpty());
		arr.add(2, 25);
		System.out.println(arr);
		System.out.println("arr.get(4) : " + arr.get(4));
		System.out.println("arr.remove(2) : " + arr.remove(2));
		System.out.println(arr);
		System.out.println("arr.contains(40) : " + arr.contains(40));
		// arr.ensureCapacity(50);
		arr.clear();
		System.out.println(arr);
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(4);
		System.out.println(arr);
		System.out.println("arr.subList(0,2) : " + arr.subList(0, 2));
		System.out.println("arr.size() : " + arr.size());
		// arr.trimToSize(10);
		System.out.println("arr.set(2, 10) : " + arr.set(2, 5));
		System.out.println(arr);
		ArrayList<Integer> al = new ArrayList<>();
		al.add(30);
		al.add(40);
		al.add(20);
		al.add(10);
		Collections.sort(al);
		arr.addAll(al);
		System.out.println("arr.addAll(al) : " + arr);
		Collections.sort(arr);
		arr.removeAll(al);
		System.out.println("arr.removeAll(al) : " + arr);
		ArrayList<String> al2 = new ArrayList<>();
		al2.add("Apple");
		al2.add("Mango");
		al2.add("Pear");
		al2.add("4");
		System.out.println(al2);
		al2.remove("4");
		System.out.println("al2.remove(\"4\") : " + al2);
		System.out.println(al2.indexOf("Pear"));
		System.out.println(al2.lastIndexOf("Pear"));

		ArrayList<Object> arrObj = new ArrayList<>();
		arrObj.add("Strings");
		arrObj.add(2);
		arrObj.add(3);
		arrObj.add(4.5);
		arrObj.add(2.07f);
		arrObj.add(true);
		System.out.println(arrObj);

		Parent p = new Child();
		Child c = (Child) p;
		p.viewParent();
		c.viewParent();
		c.viewChild();

//		Object arr1[] = arrObj.toArray();
//		String s[] = new String[arrObj.size()];
//		arrObj.toArray(s);
//		System.out.println(arr1);

		ArrayList<String> str = new ArrayList<>();
		str.add("Hello");
		str.add("Java");
		str.add("Programming");
		str.add("...");

		Iterator<String> itr = str.iterator();
		while (itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}
		String sdr = "newstring";
		String ttr = "newstring";
		System.out.println(sdr.intern() == ttr.intern());
	}

}
