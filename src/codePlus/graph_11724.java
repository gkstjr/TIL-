package codePlus;

import java.util.*;
import java.io.*;


public class graph_11724 { 
	static ArrayList<Integer>[] list;
	static boolean[] check;
	static int answer;
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		list = new ArrayList[N + 1];
		check = new boolean[N + 1];
		
		for(int i = 1 ; i < N + 1; i++) {
			list[i] = new ArrayList<Integer>();
		}
		
		for(int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			list[a].add(b);
			list[b].add(a);
		}
		
		for(int i = 1; i < N + 1; i++) {
			if(!check[i]) {
				answer++;
				dfs(i);
			}
		}
		
		System.out.println(answer);
	}
	
	static void dfs(int v) {
		check[v] = true;
		
		for(int i : list[v]) {
			if(!check[i]) {
				dfs(i);
			}
		}
		return;
	}
}
