package colombus.week1_bruteForce;

import java.io.*;
import java.util.StringTokenizer;
public class day1_hard {
	
		static int N;
		static StringBuilder answer;
	public static void main(String[] args) throws Exception{	
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;
		
		while((str = br.readLine()) != null) {
			N = Integer.parseInt(str);
			int len = (int) Math.pow(3, N);
			answer = new StringBuilder();
			
			for(int i = 0 ; i < len; i++) {
				 answer.append("-");
			}
			recur(0 , len);
			System.out.println(answer);
		}
		
	}
	
	public static void recur(int start , int size) {
		//종료 코드
		if(size == 1) return;
		int cut = size / 3;
		
		for(int i = start + cut ; i < start + cut + cut; i++) {
			answer.setCharAt(i, ' ');			
		}
		
		recur(start , cut);
		recur(start + cut * 2 , cut);
	}
}
