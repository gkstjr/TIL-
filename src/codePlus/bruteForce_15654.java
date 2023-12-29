package codePlus;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

//재귀 함수로 풀기 매개변수 (index , n , m) 여기서 start는 전 함수의 1~n까지으 수 중 선택된 수 + 1
public class bruteForce_15654 { 
	static int n , m;
	static int[] ans = new int[9];
	static int[] que; // n값 받고 객체 생성
	static boolean[] check;
	static StringTokenizer st;
	static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		st = new StringTokenizer(br.readLine());
		
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		
		que = new int[n];
		check = new boolean[n];
		for(int i = 0; i < n; i++) {
			que[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(que);
		
		recur(0 , n , m);
		
		System.out.println(sb);
				
	}
	
	static void recur(int index ,  int n , int m) {
		if(index == m) {  //출력하고 끝내기
			for(int i = 0; i < m; i++) {
				sb.append(ans[i]).append(" ");
			}
			sb.append("\n");
			return;
		}
		
		for(int i = 0 ; i < n; i++) {
			if(check[i]) continue;
			ans[index] = que[i]; 
			check[i] = true;
			recur(index + 1, n , m);
			check[i] = false;
		}
		
		//ans 배열에서 그 전 값들 중복된 건 제외
		
	}
	
}
