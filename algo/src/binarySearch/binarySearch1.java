package binarySearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
 
public class binarySearch1 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			
		}
		
		
		Arrays.sort(arr);
		
		int m = Integer.parseInt(br.readLine());
		StringTokenizer st2 = new StringTokenizer(br.readLine());
		for(int i = 0 ; i < m; i++) {
			int key = Integer.parseInt(st2.nextToken());
			
			int lo = 0;
			int hi = arr.length - 1;
			
			while(lo <= hi) {
				int mid = (hi + lo) / 2;
				
				if(arr[mid] > key) {
					hi = mid - 1;
				}else if(arr[mid] < key) {
					lo = mid + 1;
				}else {
					sb.append(1).append("\n");
					break;
				}
			}
			if(lo > hi) sb.append(0).append("\n");
		}	
		System.out.println(sb);
	}
}