package codePlus;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;


// N과 M 재귀를 이용한 브루트포스트
public class bruteForce_15649 {
	static int[] ans = new int[9];
	static boolean[] check = new boolean[9]; //false면 이전 인덱스에서 사용하지 않음
	static StringBuilder sb;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		sb = new StringBuilder();
		
		StringTokenizer st = new StringTokenizer(br.readLine());
	
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		go(0 , n ,m);
		System.out.println(sb);
	}
	
	static void go(int index ,int n ,int m) {
		if(index == m) {
			for(int i = 0; i < m; i++) {
				sb.append(ans[i]).append(" ");
			}
			sb.append("\n");
			return;
		}
		
		for(int i = 1; i <= n; i++) {
			if(check[i]) continue;
			check[i] = true;
			ans[index] = i;
			go(index +  1 , n , m);
			check[i] = false;
		}
	}
	
}
