package august1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

	
public class Day16_10989 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		
		for(int i = 0 ; i < n; i++ ) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		
		Arrays.sort(arr);
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0 ; i < n; i++) {
			sb.append(arr[i]).append("\n");
		}
		
		System.out.println(sb);
		}
}
