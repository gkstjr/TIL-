package colombus;

import java.io.*;
import java.util.StringTokenizer;
public class Main {
	StringBuilder sb;
	static int cnt = 0;
	public static void main(String[] args) throws Exception{	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		int N = Integer.valueOf(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0 ; i < N; i++) {
			sb.append(isPali(br.readLine())).append(" " + cnt + "\n");
			cnt = 0;

		}
		
		System.out.println(sb);
		
	}
	
	//재귀 없이 함수로 구하는 방법
	/*
	static int isPalin(String str) {
		String s = new StringBuilder(str).toString();
		String reverseS = new StringBuilder(str).reverse().toString();
		
		if(s.equals(reverseS)) {
			return 1;
		}else return 0;
		
	}
	*/
	
	static int isPali(String s) {
		return recursion(s, 0 , s.length() - 1);
	}
	
	static int recursion(String s , int l , int r) {
		cnt += 1;
		if(l >= r) return 1;
		
		if(s.charAt(l) != s.charAt(r)) return 0;
		return recursion(s , l + 1 , r - 1);
	}
}
