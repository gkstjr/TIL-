package binarySearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class binarySearch3 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		int[] arr = new int[n];
		
		for(int i = 0 ; i < n ; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
			Arrays.sort(arr);
			
		int m = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		
		for(int i = 0 ; i < m; i ++) {
			int target = Integer.parseInt(st.nextToken());
			sb.append(Solution(arr,target)).append(" ");
		}
		System.out.println(sb);
	}

	public static int Solution(int[] arr,  int target) {
		int high = arr.length - 1;
		int low = 0;
		int mid;
		int cnt = 0;
		while(low <= high) {
			mid = (high + low) / 2;
			
			if(arr[mid] == target) {
				cnt++;
				int index1 = mid;
				while(true) {
					index1--;
					if(index1 >= 0 && arr[index1] == target ) cnt++;
					else break;
				}
				int index2 = mid;
				while(true) {
					index2++;
					if(index2 != arr.length && arr[index2] == target ) cnt++;
					else break;
				}
				return cnt;
			}
			else if(arr[mid] < target) {
				low = mid + 1;
			}else {
				high = mid - 1;
			}
		}
		
		return cnt;
	}
}
