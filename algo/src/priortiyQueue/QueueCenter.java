package priortiyQueue;
import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
 
public class QueueCenter {
	 
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		//최소값을 우선순위로 정렬하기
		PriorityQueue<Integer> minQueue = new PriorityQueue<Integer>();
		//최대값을 우선순위로 정렬
		PriorityQueue<Integer> maxQueue = new PriorityQueue<Integer>(Collections.reverseOrder());

		int n = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < n; i++) {
			int temp = Integer.parseInt(br.readLine());
			//최소값 큐와 최대값 큐의 사이즈가 같을 때 최대값에 넣기
			if(minQueue.size() == maxQueue.size()) maxQueue.offer(temp);
			else minQueue.offer(temp);
			// 바꿔주기
			if(!minQueue.isEmpty() && minQueue.peek() < maxQueue.peek()) {
				int swap1 = minQueue.poll();
				int swap2 = maxQueue.poll();
				maxQueue.offer(swap1);
				maxQueue.offer(swap2);
			}
			sb.append(maxQueue.peek()).append("\n");
		}
		
		System.out.println(sb);
	
	}	
}