package CollectionPrograms;

import java.util.Collections;
//import java.util.Iterator;
import java.util.Stack;

public class StackEg {

	public static void main(String[] args) {
		Stack<Integer> st = new Stack<>();
		st.push(70);
		st.push(40);
		st.push(10);
		st.push(30);
		st.push(20);
//		st.forEach(System.out::println);
		st.pop();
		st.forEach(System.out::println);
		System.out.println(st.peek());
		System.out.println("=======");
		Collections.sort(st);
		st.forEach(System.out::println);
	}

}
