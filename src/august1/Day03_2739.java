package august1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Day03_2739 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 1 ; i < 10; i++) {
			System.out.println(n + " * " + i + " = " + (n * i));
		}
	}
}
