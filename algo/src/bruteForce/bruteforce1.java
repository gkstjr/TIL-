package bruteForce;
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
 
public class bruteforce1 { //브루트 포스 알고리즘 복기
	 
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		int[][] arr = new int[n][n];
		
		for(int i = 0 ; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			
			arr[i][0] = x;
			arr[i][1] = y;
		}
		
		
		for(int i = 0; i < arr.length; i++) {
			int cnt = 0;
			for(int j = 0; j < arr.length; j++) {
				if(i == j) continue;
				if(arr[i][0] < arr[j][0] && arr[i][1] < arr[j][1]) cnt++; 
			}
			sb.append(cnt + 1).append(" ");
		}
		System.out.println(sb);
	}	
}