package september;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Day04_1929 {
	static int M;
	static int N;
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		 M = Integer.parseInt(st.nextToken());
		 N = Integer.parseInt(st.nextToken());
		StringBuilder sb = new StringBuilder();
		boolean[] arr = new boolean[N + 1];
		
		is_prime(arr);
		
		for(int i = M; i <= N; i++) {
			if(!arr[i]) {
				sb.append(i).append("\n");
			}
		}
		System.out.println(sb);
		
		
	}
	
	static void is_prime(boolean[] prime) {
		
		prime[0] = prime[1] = true;
		
		for(int i = 2; i <= Math.sqrt(N); i++) {
			
			if(prime[i] == true) {
				continue;
			}
			
			for(int j = i + i; j < N + 1; j+= i) {
				prime[j] = true;
			}
		}
	}
}
