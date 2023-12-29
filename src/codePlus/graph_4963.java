package codePlus;

import java.util.*;
import java.io.*;
import java.nio.Buffer;


public class graph_4963 { 
	static int[][] list;
	static boolean[][] check;
	static int[] dx = {1,0,-1,0,1,-1,1,-1};
	static int[] dy = {0,1,0,-1,1,1,-1,-1};
	static int ans;
	static int num1;
	static int num2;
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		while(true) {
			st = new StringTokenizer(br.readLine());
			
			num1 = Integer.parseInt(st.nextToken()); //열
			num2 = Integer.parseInt(st.nextToken()); //행
			if(num1 == 0 && num2 == 0) break;
			
			list = new int[num2][num1];
			check = new boolean[num2][num1];
			
			for(int i = 0; i <num2; i++) {
				st = new StringTokenizer(br.readLine());
				for(int j = 0 ; j <num1; j++) {
					list[i][j] = Integer.parseInt(st.nextToken());
				}
			}
			
			for(int i = 0 ; i < num2; i++) {
				for(int j = 0 ; j < num1; j++) {
					if(!check[i][j] && list[i][j] == 1) {
						dfs(i,j);
						ans++;
					}
				}
			}
			sb.append(ans).append("\n");
			ans = 0;
		}
		
		System.out.println(sb);
	}
	
	static void dfs(int i , int j) {
		check[i][j] = true;
		
		for(int k = 0 ; k < 8; k++) {
			int nexti = i + dy[k];
			int nextj = j + dx[k];
			if(nexti >= 0 && nexti < num2 && nextj >= 0 && nextj < num1) {
				if(!check[nexti][nextj] && list[nexti][nextj] == 1) {
					dfs(nexti , nextj);
				}
			}
		}
	}
}
