package august1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Calendar;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());

		for(int i = 1 ; i <= n; i++) {
			for(int j = 1; j <= n - i; j++) {
				sb.append(" ");
			}
			for(int k = 1; k <= i; k++) {
				sb.append("*");
			}
			
			sb.append("\n");
		}
		
		for(int i = n - 1; i >= 1; i--) {
			for(int j = 1; j <= n - i; j++) sb.append(" ");
			for(int k = 1; k <= i; k++) sb.append("*");
			sb.append("\n");
		}
		
		
		System.out.println(sb);
	}
}
