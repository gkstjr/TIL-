package codePlus;

import java.util.*;
import java.io.*;
import java.nio.Buffer;

// 백준 기초 완강 (객사오 읽고 프로그래머스 천천히)
public class Main { 
	static ArrayList<Integer>[] list;
	static int[] parent;
	static boolean[] check;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		
		list = new ArrayList[N + 1];
		check = new boolean[N + 1];
		parent = new int[N + 1];
		for(int i = 1 ; i <= N; i++) {
			list[i] = new ArrayList();
		}
		
		for(int i = 0; i < N - 1; i++) {
			st = new StringTokenizer(br.readLine());
			int num1 = Integer.parseInt(st.nextToken());
			int num2 = Integer.parseInt(st.nextToken());
			
			list[num1].add(num2);
			list[num2].add(num1);
		}
		
		Queue<Integer> que = new LinkedList();
		que.offer(1);
		check[1] = true;
		while(!que.isEmpty()) {
			int v = que.poll();
			for(int i : list[v]) {
				if(!check[i]) {
					check[i] = true;
					parent[i] = v;
					que.offer(i);
				}
			}
		}
		
		StringBuilder sb = new StringBuilder();
		
		for(int i = 2 ; i <= N ; i++) {
			sb.append(parent[i]).append("\n");
		}
		
		System.out.println(sb);
	}
	
 }
 