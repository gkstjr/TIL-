package codePlus;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
	static Stack<Character> stk = new Stack<Character>();
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		
		boolean tag = false;
		
		for(char ch : str.toCharArray()) {
			
			if(ch == '<') {
				print();
				tag = true;
				sb.append(ch);
			}else if(ch == '>') {
				tag=false;
				sb.append(ch);
			}else if(tag) {
				sb.append(ch);
			}else if(ch == ' ') {
				print();
				sb.append(ch);
			}else {
				stk.push(ch);
			}
		}
		
		print();
		
		
		System.out.println(sb);
	}
	static void print() {
		while(!stk.isEmpty()) {
			sb.append(stk.pop());
		}
	}
}
