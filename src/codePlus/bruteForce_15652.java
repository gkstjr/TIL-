package codePlus;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

//재귀 함수로 풀기 매개변수 (index ,start, n , m) 여기서 start는 전 함수의 1~n까지으 수 중 선택된 수 + 1
public class bruteForce_15652 { 
	static int n , m;
	static int[] ans = new int[8];
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		recur(0 , 1 , n , m);
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
		for(int i = start ; i <= n; i++) {
			ans[index] = i;
			start = i;
			recur(index + 1 , start , n , m);
		}
	}
	
}
