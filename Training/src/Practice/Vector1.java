package Practice;

import java.util.Vector;

public class Vector1 {

	public static void main(String[] args) {
		Vector<Integer> vec = new Vector<>();
		vec.add(4);
		vec.add(2);
		System.out.println("vec.add(5) : " + vec.add(5));
		vec.add(1, 12);
		vec.addElement(10);
		vec.addElement(9);
		System.out.println("vec : " + vec);
		System.out.println("vec.capacity() : " + vec.capacity());
		vec.ensureCapacity(20);
		System.out.println("vec.capacity() : " + vec.capacity());
		Vector<Object> vec1 = new Vector<>();
		vec1.add(20);
		vec1.addElement(22);
		vec1.addFirst(34);
		vec1.addLast(13);
		System.out.println("vec1 : " + vec1);
		System.out.println("vec1.remove(0) : " + vec1.remove(0));
		System.out.println("vec1 : " + vec1);
		System.out.println("vec1.clone() : " + vec1.clone());
		if(vec1.contains(22)) 
			System.out.println("vec1.indexOf(22) : " + vec1.indexOf(22));
		System.out.println("vec.size() : " + vec.size());
		System.out.println(vec.hashCode());
		System.out.println(vec.elements());
	}

}
