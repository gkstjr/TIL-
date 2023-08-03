package august1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Calendar;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Day03_10818 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int[] arr = new int[N];
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		
		for(int i =0 ; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			
			if(arr[i] < min) min = arr[i];
			if(arr[i] > max) max = arr[i];
			
		}
		
		System.out.print(min + " ");
		System.out.print(max);
	}
}
