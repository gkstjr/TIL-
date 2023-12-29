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
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

		/* 
		 * 	
		 *  dp[n] = n개의 계단에 오를때의 최댓값 
		 *  점화식 dp[n] = dp[n-3] + str[n - 1] + str[n] 와 dp[n-2] + str[n] 중의 더 큰 값이 dp[n]
		 *  	  
		 * */
public class Day14_2751 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		for(int i = 0 ; i < n; i++) {
			arr.add(Integer.parseInt(br.readLine()));
		}
		
		Collections.sort(arr);
		
		for(int i = 0 ; i < arr.size(); i++) {
			sb.append(arr.get(i)).append("\n");
		}
		System.out.println(sb);
		
	}
}
