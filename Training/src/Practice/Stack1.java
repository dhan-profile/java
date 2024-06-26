package Practice;

import java.util.Stack;
import java.util.Iterator;
import java.util.Collections;

public class Stack1 {

	public static void main(String[] args) {
		Stack<Integer> st = new Stack<Integer>();
		st.push(11);
		st.push(8);
		st.push(4);
		st.push(23);
		System.out.println("st.push(12) : " + st.push(12));
		System.out.println("st : " + st);
		System.out.println("st.pop() : " + st.pop());
		System.out.println("st.empty() : " + st.empty());
		System.out.println("st.peek() : " + st.peek());
		System.out.println("st.search(11) : " + st.search(11));
		System.out.println("st.get(1) : " + st.get(1));
		System.out.println("st.isEmpty() : " + st.isEmpty());
		System.out.println("st.add(5) : " + st.add(5));
		System.out.println("st : " + st);
		Stack<Integer> st1 = new Stack<Integer>();
		st1.push(21);
		st1.push(82);
		st1.push(14);
		st1.push(40);
		System.out.println("st1 : " + st1);
		System.out.println("st.addAll(st1) : " + st.addAll(st1));
		System.out.println("st : " + st);
		System.out.println("st.contains(40) : " + st.contains(40));
		System.out.println("st.containsAll(st1) : " + st.containsAll(st1));
		System.out.println("st.equals(st1) : " + st.equals(st1));
		Stack<String> st2 = new Stack<String>();
		st2.push("Hello");
		System.out.println(st2.hashCode());
		Iterator<Integer> itr = st.iterator();
		while(itr.hasNext()){
			System.out.print(itr.next() + " ");
		}
		System.out.println("\nst.remove(1) : " + st.remove(1));
		System.out.println("st1.size() : " + st1.size());
		Collections.sort(st);
		System.out.println("st : " + st);
		System.out.println("st.removeAll(st1) : " + st.removeAll(st1));
		System.out.println("st : " + st);
		System.out.println(st.empty());
		System.out.println("st : "+st);
		System.out.println(st.elementAt(2));
		
	}

}
