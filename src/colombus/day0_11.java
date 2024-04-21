package colombus;

import java.io.*;
import java.util.StringTokenizer;
public class day0_11 {
	
	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.valueOf(br.readLine());
		
		for(int i = n; i > 0; i--) {
			System.out.println(i);
		}
	}
}
