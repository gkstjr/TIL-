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


public class Day18_1991 {
	static int N;
	static int[][] tree;
	static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		N = Integer.parseInt(br.readLine());
		
		tree = new int[26][2];
		
		for(int i = 0 ; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			
			int parent = st.nextToken().charAt(0) - 'A';
			int childX = st.nextToken().charAt(0) - 'A';
			int childY = st.nextToken().charAt(0) - 'A';
			
			tree[parent][0] = (childX == -19) ? -1 : childX;
			tree[parent][1] = (childY == -19) ? -1 : childY;
		}
		
		solution();
		
	}
	
	static void solution() {
		preOrder(0);
		sb.append("\n");
		
		inOrder(0);
		sb.append("\n");
		postOrder(0);
		
		System.out.println(sb);
		
	}
	static void preOrder(int x) {
		if(x == -1) return;
		
		sb.append((char)(x + 'A'));
		
		preOrder(tree[x][0]);
		
		preOrder(tree[x][1]);
	}
	
	static void inOrder(int x) {
		if(x == -1) return;
		
		inOrder(tree[x][0]);
		
		sb.append((char)(x + 'A'));
		
		inOrder(tree[x][1]);
	}
	
	static void postOrder(int x) {
		if(x == -1) return;
				
		postOrder(tree[x][0]);
		
		postOrder(tree[x][1]);
		
		sb.append((char)(x + 'A'));
	}
}