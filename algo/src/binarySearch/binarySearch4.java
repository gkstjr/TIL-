package binarySearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class binarySearch4 {
	public static void main(String[] args) throws NumberFormatException, IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int k = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());
		
		
		long max = 0;
		long min = 0;
		long[] arr = new long[k];
		
		for(int i = 0; i < arr.length; i++ ) {
			arr[i] = Long.parseLong(br.readLine());
			
			if(max < arr[i]) {
				max = arr[i];
			}
		}
		
		max++;
		
		long mid;
		while(min < max) {
			long count =0;
			mid = (min + max) / 2;
			
			for(int i = 0 ; i < arr.length; i++) {
				count += arr[i] / mid;
			}
			
			if(count < n) {
				max = mid;
			}
			else {
				min = mid + 1;
			}
			
		}
		System.out.println(min - 1);
	}
}
