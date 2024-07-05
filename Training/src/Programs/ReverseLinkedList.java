package Programs;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class ReverseLinkedList {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>(Arrays.asList(5,3,4,6,2,8,1));
//		System.out.println(list.reversed()); 
		Collections.reverse(list);
		System.out.println(list);
	}

}
