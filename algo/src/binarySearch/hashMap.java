package binarySearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class hashMap {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		st = new StringTokenizer(br.readLine());

		for(int i = 0 ; i < n ; i++) {
			int key = Integer.parseInt(st.nextToken());
			map.put(key, map.getOrDefault(key, 0) + 1);
		}
			
		int m = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		
		for(int i = 0 ; i < m; i ++) {
			int target = Integer.parseInt(st.nextToken());
			sb.append(map.getOrDefault(target, 0)).append(" ");
		}
		System.out.println(sb);
	}

}
