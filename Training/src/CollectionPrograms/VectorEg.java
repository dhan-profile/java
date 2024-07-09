package CollectionPrograms;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VectorEg {

	public static void main(String[] args) {
		Vector<Integer> vec = new Vector<>();
		vec.add(40);
		vec.add(50);
		vec.add(10);
		vec.add(30);
		vec.forEach(System.out::println);
		
//		ENUMERATION => elements(), hasMoreElements(), nextElement()
		for (Enumeration<Integer> e= vec.elements(); e.hasMoreElements(); ) {
			System.out.print(e.nextElement()+" ");
		}
	}

}
