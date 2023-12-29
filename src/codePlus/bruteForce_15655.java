package codePlus;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

//재귀 함수로 풀기 매개변수 (index ,start, n , m) 여기서 start는 전 함수의 1~n까지으 수 중 선택된 수 + 1
public class bruteForce_15655 { 
	static int n , m;
	static int[] ans = new int[8];
	static int[] que;
	static boolean[] check;
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		que = new int[n];
		check = new boolean[n];
		st = new StringTokenizer(br.readLine());
		
		for(int i = 0 ; i < n; i++) {
			que[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(que);
		
		recur(0 , 0 , n , m);
		
		System.out.println(sb);
	}
	
	static void recur(int index , int start , int n , int m) {
		//재귀 함수의 끝 조건
		if(index == m) {
			for(int i = 0; i < m; i++) {
				sb.append(ans[i]).append(" ");
			}
			sb.append("\n");
			return;
		}
		
		//재귀함수 로직
		for(int i = start ; i < n; i++) {
			if(check[i]) continue;
			ans[index] = que[i];
			start = i + 1;
			recur(index + 1 , start , n , m);
		}
	}
	
}
