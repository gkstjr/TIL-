package colombus.week1;

import java.io.*;
import java.util.StringTokenizer;
public class day0_7 {
	
	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			
			int A = Integer.valueOf(st.nextToken());
			int B = Integer.valueOf(st.nextToken());
			
			int sum = A + B;
			
			sb.append("Case #" + (i + 1) + ": ").append(sum).append("\n");
		}
		System.out.println(sb);
	}
}
