package codePlus;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

// 브루트 포스로 순열 구하기
// prevPurmutation
public class bruteForce_11723 { 
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st;
		
		int M = Integer.parseInt(br.readLine());
		
		int S = 0;
		StringBuilder sb =  new StringBuilder();
		for(int i = 0 ; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			
			String str = st.nextToken();
			
			if(str.equals("all")) S = (1 << 21) - 1;
			else if(str.equals("empty")) S = 0; 
			else {
				int num = Integer.parseInt(st.nextToken());
				
				if(str.equals("add")) {
					S = S | (1 << num);
				}else if(str.equals("check")) {
					if((S & (1 << num)) != 0) sb.append(1).append("\n");
					else sb.append(0).append("\n");
				}else if(str.equals("remove")) {
					S = S & ~(1 << num);
				}else if(str.equals("toggle")) {
					S = S ^ (1 << num);
				}
			}
		}
		
		System.out.println(sb);
	}
}
