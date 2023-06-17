package binarySearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

//import programmers.Solution;

public class binarySearch2 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0 ;  i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr);
		
		int m = Integer.parseInt(br.readLine());
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0 ; i < m; i++) {
			int target = Integer.parseInt(st.nextToken());
			System.out.println(Solution(arr , target));
		}
	}
	
	public static int Solution(int[] arr , int target) {
		
		int high = arr.length - 1;
		int low = 0;
		int mid;
		while(low <= high) {
			mid = (low + high) / 2;
			
			if(arr[mid] == target) {
				return 1;
			}else if(arr[mid] < target) {
				low = mid + 1;
			}else {
				high = mid - 1;
			}
				
		}
		return 0;
	}
}
