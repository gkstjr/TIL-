package codePlus;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

//재귀 함수로 풀기 매개변수 (index , start , n , m)
public class bruteForce_15650 {
	static int n;
	static int m;
	static int[] ans = new int[9];
	static boolean[] check = new boolean[9];
	static StringBuilder sb;
	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		
		sb = new StringBuilder();
		
		
	    recur(0 , 1 , n , m);
	    
	    System.out.println(sb);
	}
	
	
	static void recur(int index , int start , int n , int m) {
		if(m == index) {
			//재귀 함수 끝 시점이니 출력
			for(int i = 0; i < m ; i++) {
				sb.append(ans[i]).append(" ");
			}
			sb.append("\n");
			return;
		}
		
		for(int i = start; i <=n; i++) {
			if(check[i]) continue; // check 가 true 면 그 전에 해당 i 사용했다는 뜻이다.
			check[i] = true;
			ans[index] = i;
			start = i + 1;
			recur(index + 1 , start, n , m );
			check[i] = false;
		}
	}
}
