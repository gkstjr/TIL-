package codePlus;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

//브루트 포스 재귀로 숫자 더하기 문제 풀기
public class bruteForce_9095 { 
	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		for(int t = 0 ; t < T; t++ ) {
			int n = Integer.parseInt(br.readLine());
			int ans = recur(0 , n);
			sb.append(ans).append("\n");
		}
		
		System.out.println(sb);
	}
	
	
	static int recur(int sum , int goal) {
		if(sum == goal) return 1;
		if(sum > goal) return 0;
		
		int ans = 0;
		
		for(int i = 1; i <= 3; i++ ) {
			ans += recur(sum + i,goal); 
		}
		
		return ans;
	}
}
