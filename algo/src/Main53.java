import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
 
public class Main53 {
	public static void main(String[] args) throws NumberFormatException, IOException {
 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		Stack<Integer> sk = new Stack<Integer>();
		
		int start = 0 ;
		
		while(n --> 0) {
			
			int value = Integer.parseInt(br.readLine());
			
			if(value > start) {
				for(int i = start + 1; i <= value; i++) {
					sk.push(i);
					sb.append("+").append("\n");
				}
				start = value;
			}
			
			else if(sk.peek() != value) {
				System.out.println("NO");
				return;
			}
			
			sk.pop();
			sb.append("-").append("\n");
		}
	
		System.out.println(sb);
	}
}