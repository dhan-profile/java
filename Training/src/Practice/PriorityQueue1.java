package Practice;
import java.util.PriorityQueue;
public class PriorityQueue1 {

	public static void main(String[] args) {
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		pq.offer(24);
		pq.offer(12);
		pq.offer(8);
		pq.offer(32);
		pq.add(5);
		System.out.println("pq : " + pq);
		System.out.println("pq.offer(50) : "+pq.offer(50));
		System.out.println("pq.poll() : " + pq.poll());
		System.out.println("pq : " + pq);
		System.out.println("pq.peek() : "+pq.peek());
		System.out.println("pq.element() : "+pq.element());
		System.out.println("pq.remove() : "+pq.remove());
		System.out.println("pq : "+pq);
		
	}
}
