package colombus;

import java.io.*;
import java.util.StringTokenizer;
public class day0_6 {
	
	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		String str;
		
		while((str = br.readLine()) != null) {
			
			st = new StringTokenizer(str);
			
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			
			if(A == 0 && B == 0) break;
			
			sb.append(A + B + "\n");
		}
	
		System.out.println(sb);
	}
}
