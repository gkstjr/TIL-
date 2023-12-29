package backjun;
import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
 
public class Main52 {
	public static void main(String[] args) throws NumberFormatException, IOException {
 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < n; i++) {
			sb.append(solve(br.readLine())).append("\n");
		}
		System.out.println(sb);
	}	
		
		public static String solve(String s) {
			String answer = "";
			Stack<Character> sk = new Stack<Character>();
			for(int i = 0; i < s.toCharArray().length; i++) {
				char ch = s.charAt(i);
				
				if(ch == '(') {
					sk.push(ch);
				}else if(ch == ')') {
					if(sk.isEmpty()) {
						return "NO";
					}else {
						sk.pop();						
					}
					
				}
			}
			
			if(sk.isEmpty()) {
				answer = "YES";
			}else {
				answer = "NO";
			}
			
			return answer;
		}
}