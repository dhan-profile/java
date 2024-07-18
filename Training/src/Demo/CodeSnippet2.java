package Demo;

import java.util.PriorityQueue;

public class CodeSnippet2 {
	public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.offer(10);
        pq.offer(20);
        pq.offer(15);
        pq.peek();
        pq.poll();
        System.out.println(pq.peek());
	}

}
