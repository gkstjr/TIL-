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

		for(int i = 1; i <= n; i++) {
			for(int k = 1; k <= n - i; k++) {
				if(i == n) {
					break;
				}
				sb.append(" ");
			}
			for(int j = 1; j <= i + (i - 1); j++) {
				if(i == n || i == 1) {
					sb.append("*");
					
				}else if(i == n - 1) {
					if(j % 2 == 0 || j == n - 1) sb.append(" ");
					else sb.append("*");	
				}
				else {		
					if(j % 2 == 0) sb.append(" ");
					else sb.append("*");		
					
				}
			}
			sb.append("\n");
		}
		System.out.println(sb);
	}
}
