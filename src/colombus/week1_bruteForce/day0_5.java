package colombus.week1_bruteForce;

import java.io.*;
import java.util.StringTokenizer;
public class day0_5 {
	
	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		while((st = new StringTokenizer(br.readLine())).hasMoreElements()) {
			
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			
			sb.append(A + B + "\n");
		}
	
		System.out.println(sb);
	}
}
