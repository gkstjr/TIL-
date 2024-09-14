package programmers.book.queue;
import java.util.*;

public class Queue_01 {
	public static void main(String[] args) {
		int answer = solution(5 , 3);
		System.out.println(answer);
	}
	
	//클래스마다 맞는 메소드로 변경
	public static int solution(int n , int k) {
		int cnt = 1;
		Queue<Integer> queue = new ArrayDeque<>();
		
		for(int i = 1; i < n + 1; i++) {
			queue.add(i);
		}
		
		while(queue.size() != 1) {
			if(cnt == k) {
				queue.poll();
				cnt = 1;
			}else {
				cnt += 1;
				queue.add(queue.poll());
			}
		}

		return queue.poll();
	}
}
