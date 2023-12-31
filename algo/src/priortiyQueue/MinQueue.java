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
 
public class MinQueue { // MinQueue 복기
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		//기본값이  최소값 우선 으로 되어 있으므로 아래 코드로 구
		PriorityQueue<Integer> minQueue = new PriorityQueue<Integer>();
		//최대값을 우선순위로 할 때는 Queue 생성시 Collections를 이용해 바꿔줄 수 있다.
//		PriorityQueue<Integer> maxQueue = new PriorityQueue<Integer>(Collections.reverseOrder());
		
		for(int i = 0; i < n; i++) {
			int num = Integer.parseInt(br.readLine());
			
			//입력 받은 수가 0일 때
			if(num == 0) {
				if(minQueue.isEmpty()) {
					sb.append(0).append("\n");
				}else sb.append(minQueue.poll()).append("\n");
			// 입력받은 수가 0이 아닌 정수일 때
			}else {
				minQueue.offer(num);
			}
		}
		System.out.println(sb);
	}
}