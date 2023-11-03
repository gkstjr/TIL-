package codePlus;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class bruteForce_1476 {
	public static void main(String[] args) throws NumberFormatException, IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		int E = 0; int S = 0; int M = 0;
		
		E = Integer.parseInt(st.nextToken());
		S = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		int e = 0; int s = 0; int m = 0;
		int cnt = 0;
		
		while(true) {
			e++; s++; m++;
			cnt++;
			
			if(e > 15) e = 1;
			if(s > 28) s = 1;
			if(m > 19) m = 1;
			
			if(e == E && s == S && m == M) break;
		}
		
		System.out.println(cnt);
	}
}
