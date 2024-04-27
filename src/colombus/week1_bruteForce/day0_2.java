package colombus.week1_bruteForce;

import java.io.*;
import java.util.StringTokenizer;
public class day0_2 {
	
	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.valueOf(st.nextToken());
		int sum = A + B;
		System.out.println(sum);
	
	}
}
