package codePlus;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

//재귀 함수로 풀기 매개변수 (index , n , m)
public class bruteForce_15651 { 
	static int n , m;
	static int[] ans = new int[7];
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		recur(0 , n , m);
		System.out.println(sb);
	}
	
	static void recur(int index, int n , int m) {
		if(index == m) {
			for(int i = 0 ; i < m; i++) {
				sb.append(ans[i]).append(" ");
			}
			
			sb.append("\n");
			return;
		}
		
		for(int i = 1; i <= n; i++) {
			ans[index] = i;
			recur(index + 1 , n , m);
			
		}
	}
}
