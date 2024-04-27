package colombus.week1;

import java.io.*;
import java.util.*;
public class day3_basic2 {
	
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int a = Integer.valueOf(st.nextToken());
		int b = Integer.valueOf(st.nextToken());
		int c = Integer.valueOf(st.nextToken());
		int d = Integer.valueOf(st.nextToken());
		int e = Integer.valueOf(st.nextToken());
		int f = Integer.valueOf(st.nextToken());
		
		boolean one = false;
		boolean two = false;
		int answer1 = 0;
		int answer2 = 0;
		
		for(int i = -999; i <= 999; i++) {
			for(int j = -999; j <= 999; j++) {
				one =  a * i + b * j == c;
				two = d * i + e * j == f;
				if(one && two) {
					System.out.println(i + " " + j);
					break;
				}
			}
		}
	}
		
}