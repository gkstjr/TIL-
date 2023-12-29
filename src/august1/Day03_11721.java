package august1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.StringTokenizer;

public class Day03_11721 {
//	public static void main(String[] args) throws IOException { 내 풀이
//
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		
//		StringBuilder sb = new StringBuilder();
//		
//		String str = br.readLine();
//		int cnt = (str.length() /  10) + 1;
//		for(int i = 0 ; i < cnt; i++) {
//			
//			sb.append(str.substring(0,(str.length() >= 10 ? 10 : str.length()))).append("\n");
//			
//			if(str.length() >= 10)
//			str = str.substring(10);
//		}
//
//		System.out.println(sb);
//		
//		
//	}
	// 조금 더 간단한 풀이 
	public static void main(String[] args) throws IOException { 
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		
		for(int i = 0 ; i < str.length(); i++) {
			
			System.out.print(str.charAt(i));
			if(i % 10 == 9) System.out.println();
		}
	}
}
