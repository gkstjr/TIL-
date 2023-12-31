package codePlus;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

// 브루트 포스로 순열 구하기
// prevPurmutation
public class Dfs_13023 { 
	static ArrayList<Integer>[] list;
	static boolean[] visited; 
	static int N;
	static int M;
	static int result;
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		list = new ArrayList[N];
		visited = new boolean[N];
		
		for(int i = 0 ; i < N; i++) {
			list[i] = new ArrayList<Integer>();
		}
		
		for(int i = 0; i < M; i++) {
			st= new StringTokenizer(br.readLine());
			
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			list[a].add(b);
			list[b].add(a);
		}
		
		for(int i = 0 ; i < N;i++) {
			visited[i] = true;
			dfs(i , 0);
			visited[i] = false;
			
			if(result == 1) {
				break;
			}
		}
		System.out.println(result);
				
	}
	static void dfs(int n , int count) {
		if(count >= 4) {
			result = 1;
			return;
		}
		
		for(int num : list[n]) {
			if(!visited[num]) {
				visited[num] = true;
				dfs(num , count + 1);
				visited[num] = false;
			}
		}
	}
}
