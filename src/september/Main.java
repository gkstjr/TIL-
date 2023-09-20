package september;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;


public class Main {
	static int[] parent;
	static boolean[] visited;
	static ArrayList<Integer>[] list;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st;
		visited = new boolean[N + 1];
		parent = new int[N + 1];
		list = new ArrayList[N + 1];
		
		for(int i = 0 ; i < N +1; i ++) {
			list[i] = new ArrayList<Integer>();
		}
		
		for(int i = 0 ; i < N -1; i++) {
			st = new StringTokenizer(br.readLine());
			
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			list[a].add(b);
			list[b].add(a);
		}
		
		dfs(1);
		
		for(int i =2 ; i < parent.length; i++) {
			sb.append(parent[i]).append("\n");
		}
		System.out.println(sb);
	}
		

	static void dfs(int info) {
		visited[info] = true;
		ArrayList<Integer> nei = list[info];
		
		for(int neiInfo : nei) {
			if(!visited[neiInfo]) {
				parent[neiInfo] = info;
				dfs(neiInfo);
			}
		}
	}
	}


