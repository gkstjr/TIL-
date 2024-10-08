package programmers.book.queue;
import java.util.*;

public class QueueBasic {
	public static void main(String[] args) {
		
		Queue<Integer> queue = new ArrayDeque<>();
		
		queue.add(1);
		queue.add(2);
		queue.add(3);
		
		int first = queue.poll();
		System.out.println(first);
		
		queue.add(4);
		queue.add(5);
		
		System.out.println(queue.poll());
		
	
		ArrayDeque<Integer> deque = new ArrayDeque<>();
		
		deque.addFirst(1);
		deque.addFirst(2);
		deque.addFirst(3);
		System.out.println(deque.pollFirst());
		System.out.println(deque.pollLast());
		
	}

	public static int[] solution(int[] arr) {
		
		
		return arr;
	}
}
