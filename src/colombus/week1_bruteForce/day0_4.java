package colombus.week1_bruteForce;

import java.io.*;
import java.util.StringTokenizer;
public class day0_4 {
	
	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.valueOf(st.nextToken());
		
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			int A = Integer.valueOf(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			
			int sum = A + B;
			sb.append(sum + "\n");
		}
		
		System.out.println(sb);
	}
}
