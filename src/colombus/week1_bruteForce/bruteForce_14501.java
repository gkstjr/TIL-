package colombus.week1_bruteForce;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bruteForce_14501 {
	static int maxSum;
	static int[] T;
	static int[] P;
	static int N;
	
	public static void main(String[] args) throws Exception{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		N = Integer.valueOf(br.readLine());
		T = new int[N + 2];
		P = new int[N + 2];
		
		for(int i = 1 ; i < N + 1; i++) {
			st = new StringTokenizer(br.readLine());
			
			T[i] = Integer.valueOf(st.nextToken());
			P[i] = Integer.valueOf(st.nextToken());
			
		}
		
		select(1 , 0);
		System.out.println(maxSum);
	}
	
	public static void select(int day , int sum) {
		if(day > N + 1) return;
		if(day == N + 1 ) {
			maxSum = Math.max(sum , maxSum);
			return;
		}
		
		select(day + T[day] , sum + P[day]);
		select(day + 1 , sum);
	
	}
}
