package codePlus;

import java.util.*;
import java.io.*;
import java.nio.Buffer;


public class graph_16929 { 
	static String[][] list;
	static int[] dx = {0,0,1,-1};
	static int[] dy = {1,-1,0,0};
	static boolean[][] check;
	static int FirstJ; //열
	static int FirstI; //행
	static int N; // 행
	static int M; // 열
	
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		list = new String[N][M];
		
		for(int i = 0 ; i < N; i++) {
			String str = br.readLine();
			for(int j = 0; j < M; j++) {
				list[i][j] = String.valueOf(str.charAt(j));
			}
		}
		
		for(int i = 0 ; i < N; i++) {
			for(int j= 0; j < M; j++) {
				check = new boolean[N][M];
				FirstJ = j; //열
				FirstI = i; // 행
				if(dfs(i , j , 0)) { // true면 YES
					System.out.println("Yes");
					return;
				}
			}
 		}
		System.out.println("No");
	}
	
	static boolean dfs(int i , int j , int cnt ) {
		if(check[i][j]) {
			if(cnt >= 4 && i == FirstI && j == FirstJ) return true;
			else return false;
		}
		check[i][j] = true;
		
		for(int k = 0; k < 4; k++) {
			int nextI = i + dy[k];
			int nextJ = j + dx[k];
			
			if(nextI >= 0 && nextI < N && nextJ >= 0 && nextJ < M) {
				if(list[i][j].equals(list[nextI][nextJ])) {
					if(dfs(nextI, nextJ , cnt + 1)) return true;
				}
			}
		}
		
		return false;		
	}
 }
