package colombus;

import java.io.*;
import java.util.StringTokenizer;
public class day0_3 {
	
	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int A = Integer.parseInt(br.readLine());
		int B = Integer.valueOf(br.readLine());
		
		int sum = A + B;
		System.out.println(sum);
	
	}
}
