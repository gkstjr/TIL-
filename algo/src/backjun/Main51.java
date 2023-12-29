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
 
public class Main51 {
	public static void main(String[] args) throws NumberFormatException, IOException {
 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder answer = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			while(st.hasMoreTokens()) {
				StringBuilder sb = new StringBuilder(st.nextToken());
				answer.append(sb.reverse()).append(" ");
			} 
			answer.append("\n");
		}
 		System.out.println(answer);
	}	
}