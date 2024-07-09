package Practice;
//import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

class QueueSorter implements Comparator<Integer>{
	public int compare(Integer o1, Integer o2) {
		return o1.compareTo(o2);
	}
	
}

public class PriorityQueue1 {

	public static void main(String[] args) {
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>(new QueueSorter());
		pq.offer(24);
		pq.offer(12);
		pq.offer(8);
		pq.offer(32);
		pq.add(5);
		System.out.println("pq : " + pq);
//		================================
		//        5
		//       / \
		//      8   12
		//     / \
		//    32  24
//		================================	
//		Output: 5, 8, 12, 32, 24
//		================================
//		offer(), remove(), peek(), poll(), element() 
		System.out.println("pq.offer(50) : "+pq.offer(50));	// Inserted at End 
		System.out.println("pq.poll() : " + pq.poll());	// Removed at Beginning
		System.out.println("pq : " + pq);
		System.out.println("pq.peek() : "+pq.peek());
		System.out.println("pq.element() : "+pq.element());
		System.out.println("pq.remove() : "+pq.remove());
		System.out.println("pq : "+pq);
	}
}
