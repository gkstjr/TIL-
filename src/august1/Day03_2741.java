package august1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Day03_2741 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		StringBuilder sb = new StringBuilder();
		
		for(int i = 1 ; i <= N; i++) {
			sb.append(i + "\n");
		}
		System.out.println(sb);
	}
}
