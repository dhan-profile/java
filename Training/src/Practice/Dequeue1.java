package Practice;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Comparator;

public class Dequeue1 {

	public static void main(String[] args) {
		ArrayDeque<Integer> dq = new ArrayDeque<Integer>();
		
		// We use ArrayDequeue because we cannot create object for Dequeue
		// because Dequeue is an interface, ArrayDeque implements Dequeue interface
		// Queue(Interface) --extends--> Dequeue(Interface) --implements--> ArrayDeque(Class)
		// ArrayDeque is not suitable for sorting
		
		dq.offer(50);
		dq.offer(40);
		dq.offer(65);
		System.out.println("dq : "+dq);
		System.out.println("dq.offer(25) : " + dq.offer(25));
		System.out.println("dq.offerFirst(1) : "+dq.offerFirst(1));
		System.out.println("dq.offerLast(73) : "+dq.offerLast(73));
		System.out.println("dq : "+dq);
		dq.push(2);
		System.out.println("dq : "+dq);
		System.out.println("dq.pop() : "+dq.pop());
		System.out.println("dq : "+dq);
		System.out.println("dq.poll() : "+dq.poll());
		System.out.println("dq : "+dq);
		System.out.println("dq.pollFirst() : "+dq.pollFirst());
		System.out.println("dq.pollLast() : "+dq.pollLast());
		System.out.println("dq.peek() : "+dq.peek());
		System.out.println("dq.peekFirst() : "+dq.peekFirst());
		System.out.println("dq.peekLast() : "+dq.peekLast());
		System.out.println("dq : "+dq);
//		Collections.sort(dq);
	}

}
