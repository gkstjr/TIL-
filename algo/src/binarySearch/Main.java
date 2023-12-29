package binarySearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] arr = new int[n];
		int max = 0;
		int min = 0;
		
		for(int i = 0 ; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			
			if(max < arr[i]) {
				max = arr[i];
			}
		}
		int m = Integer.parseInt(br.readLine());
		max++;
		
		long sum = 0;
		int mid = 0;
		while(min < max) {
			sum = 0;
			mid = (min + max) / 2;
			
			for(int i = 0 ; i < arr.length; i++) {
				if(arr[i] < mid) {
					sum += arr[i];
				}else {
					sum += mid;
				}
			}
			
			if(sum < m) {
				min = mid + 1;
			}
			else {
				max = mid;
			}
	
		}
		
		System.out.println(mid);
		
 	}
}