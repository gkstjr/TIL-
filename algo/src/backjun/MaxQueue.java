package backjun;
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
 
public class MaxQueue {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
	
		PriorityQueue<Integer> maxQueue = new PriorityQueue<Integer>(Collections.reverseOrder());
		
		for(int i = 0; i < n; i++) {
			int num = Integer.parseInt(br.readLine());
			
			//입력 받은 수가 0일 때
			if(num == 0) {
				if(maxQueue.isEmpty()) sb.append(0).append("\n");
				else sb.append(maxQueue.poll()).append("\n");
			// 입력받은 수가 0이 아닌 정수일 때
			}else maxQueue.offer(num);
		}
		System.out.println(sb);
	}
}