import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
 
public class Main54 {
	public static void main(String[] args) throws NumberFormatException, IOException {
 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		String text = br.readLine();
		int n = Integer.parseInt(br.readLine());
		
		Stack<Character> answerSK = new Stack<Character>();
		Stack<Character> subSK = new Stack<Character>();
		for(int i = 0 ; i < text.length(); i++) {
			answerSK.push(text.charAt(i));
		}
		for(int i = 0 ;i < n; i++) {
			st = new StringTokenizer(br.readLine());
			char order1 = st.nextToken().charAt(0);
			if(order1 == 'P') {
				char order2 = st.nextToken().charAt(0);
				answerSK.push(order2);
			}else if(order1 == 'L') {
				if(answerSK.isEmpty()) {
					continue;
				}
				char pop = answerSK.pop();
				subSK.push(pop);
			}else if(order1 == 'D') {
				if(subSK.isEmpty()) {
					continue;
				}
				char pop = subSK.pop();
				answerSK.push(pop);
			}else if(order1 == 'B') {
				if(answerSK.isEmpty()) {
					continue;
				}
				answerSK.pop();
			}
			
		}
			while(!subSK.isEmpty()) {
				answerSK.push(subSK.pop());
			}
			
			while(!answerSK.isEmpty()) {
				 sb.append(answerSK.pop());
			}
			System.out.println(sb.reverse());
	}
}