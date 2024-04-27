package colombus.week1_bruteForce;

import java.io.*;
import java.util.StringTokenizer;
public class day0_8 {
	
	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;
		StringBuilder sb = new StringBuilder();
		
		while((str = br.readLine()) != null) {
			sb.append(str + "\n");
		}
		
		System.out.println(sb);
	}
}
