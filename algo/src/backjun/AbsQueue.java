package backjun;
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
 
public class AbsQueue {// 정치기 기간 복습중
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		//절대값으로 정렬 되게 compartor 인터페이스 구현
		PriorityQueue<Integer> absQueue = new PriorityQueue<Integer>(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				if(Math.abs(o1) > Math.abs(o2)) { //절대값이 같지 않은 경우 절댓값이 작은 순서로 정렬한다.
					return Math.abs(o1) - Math.abs(o2); // 절대값 o1이 절대값 o2보다 크다면 양수반환하므로 자리를 바꾼다 / o1이 더 작다면 음수를 반환하며 자리를 유지한다.
				}else if(Math.abs(o1) == Math.abs(o2)){ //절대값이 같을 
					if(o1 > o2) return 1; // o1 이 o2보다 크면 순서 변경
					else return -1; // o1이 o2보다 작으면 순서유지
				}else return -1;
			}
		});
		
		int n = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < n; i++ ) {
			int num = Integer.parseInt(br.readLine());
			//입력받은 수가 0일때
			if(num == 0) {
				if(absQueue.isEmpty()) sb.append(0).append("\n"); //queue가 비어있을 때 0 출력
				else sb.append(absQueue.poll()).append("\n");
			}else absQueue.offer(num);
		}
	
	System.out.println(sb);
	}	
}