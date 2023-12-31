package priortiyQueue;
import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
 
public class MinQueue2 {// MinQueue 복기
	 
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		//절대값으로 정렬 되게 compartor 인터페이스 구현
		PriorityQueue<Long> minQueue = new PriorityQueue<Long>();
		
		
		int n = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < n; i++ ) {
			Long num = Long.parseLong(br.readLine());
			minQueue.offer(num);			
		}
		
		Long sum = 0L; //합계 변수
		while(minQueue.size() > 1) {
			//	Queue에서 두개를 빼 더해주
				long temp = minQueue.poll() + minQueue.poll();
				
				sum += temp;
				//두개 더한 값 다시 Queue에 넣어주기
				minQueue.offer(temp);
			}
		
	
	System.out.println(sum);
	}	
}