package august1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.StringTokenizer;

public class Day03_11022 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine());
		
		for(int i = 0 ; i < n ; i++) {
		    
			st = new StringTokenizer(br.readLine(), " ");
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			sb.append("Case #" + (i + 1) + ": " + a + " + " + b + " = " + (a + b) + "\n");
			
		}
		System.out.println(sb);
	}
}
