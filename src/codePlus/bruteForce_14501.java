package codePlus;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

// 브루트 포스로 순열 구하기
// prevPurmutation
public class bruteForce_14501 { 
	static int[] T;
	static int[] P;
	static int n;
	static StringTokenizer st;
	static int maxSum = 0;
 	public static void main(String[] args) throws Exception{
		
 		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 		
 		n = Integer.parseInt(br.readLine());
 		
 		T = new int[n + 1];
 		P = new int[n + 1];
 		for(int i = 1 ; i <= n; i++) {
 			st = new StringTokenizer(br.readLine());
 			T[i] = Integer.parseInt(st.nextToken());
 			P[i] = Integer.parseInt(st.nextToken());
 		}
 		
 		select(1 , 0);
 		
 		System.out.println(maxSum);
 		
	}
 	
 	static void select(int day , int sum) {
 		if(day == n + 1) {
 			maxSum = Math.max(sum, maxSum);
 			return;
 		}
 		if(day > n + 1) {
 			return;
 		}
 		
 		//상담 할때와 안 할때 두가지 경우 로직
 		select(day + T[day] , sum + P[day]);
 		
 		select(day + 1 , sum);
 		
 	}
}
