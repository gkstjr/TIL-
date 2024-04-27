package colombus.week1_bruteForce;

import java.io.*;
import java.util.*;
public class day4_basic {
	static int N , K , ans;
	static int[] arr;
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.valueOf(st.nextToken());
		K = Integer.valueOf(st.nextToken());
		
		arr = new int[K];
		ans = Integer.MIN_VALUE;
		
		st = new StringTokenizer(br.readLine());
		
		for(int i = 0; i < K; i++) {
			arr[i] = Integer.valueOf(st.nextToken());
		}
		
		Arrays.sort(arr);
		dfs(0);
		System.out.println(ans);
		
	}
	
	static void dfs(int total) {
		if(total > N) return;
		if(total > ans) ans = total;
		for(int i = K - 1; i >= 0; i--) {
			dfs(total * 10 + arr[i]);
		}
	}
}