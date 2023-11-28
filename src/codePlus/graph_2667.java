package codePlus;

import java.util.*;
import java.io.*;
import java.nio.Buffer;


public class graph_2667 { 
	static boolean[][] check;
	static int[][] list;
	static int totalAns;
	static ArrayList<Integer> ansList = new ArrayList<Integer>();
	static int ans;
	static int n;
	static int[] dx = {0 , 1 , 0 , -1};
	static int[] dy = {1 , 0 , -1 , 0};
	
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		n = Integer.parseInt(br.readLine());
		
		list = new int[n][n];
		check = new boolean[n][n];
		for(int i = 0 ; i < n; i++) {
			String str = br.readLine();
			for(int j = 0; j < n; j++) {
				list[i][j] = str.charAt(j) - '0';
			}
		}
		
		for(int i = 0 ; i < n; i++) {
			for(int j = 0 ; j <n; j++) {
				if(!check[i][j] && list[i][j] == 1) {
					dfs(i , j , 1);
					totalAns += 1;
					ansList.add(ans);
					ans = 0;
				}
			}
		}
		sb.append(totalAns).append("\n");
		Collections.sort(ansList);
		for(int i : ansList) {
			sb.append(i).append("\n");
		}
	System.out.println(sb);
	}
	
	static void dfs(int i, int j, int cnt) {
		ans++;
		check[i][j] = true;
		
		for(int k = 0; k < 4; k++) {
			int y = i + dy[k]; //행
			int x = j + dx[k]; //열
			if(y >= 0 && y < n && x >=0 && x < n) {				
 				if(!check[y][x] && list[y][x] == 1) {
					dfs(y , x , cnt++);
				}
			}
		}
		
	}
}
