package colombus.week1_bruteForce;

import java.io.*;
import java.util.StringTokenizer;
public class day0_9 {
	
	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[] str = br.readLine().split("");
		StringBuilder sb = new StringBuilder();
		int sum = 0;
		for(int i = 0 ; i < str.length; i++) {
			sum += Integer.valueOf(str[i]);
		}
		
		System.out.println(sum);
	}
}
