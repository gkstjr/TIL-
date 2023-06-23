package algo.dfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Dfs8 {
	static int[] parent;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		Node8[] nodes = new Node8[N + 1];
		parent = new int[N + 1];
		
		for(int i = 0 ; i < N + 1; i++) {
			Node8 node = new Node8(i);
			nodes[i] = node;
		}
		
		for(int i = 0 ; i < N - 1; i++) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			
			nodes[x].addSide(nodes[y]);
			nodes[y].addSide(nodes[x]);
		}
		
			
			nodes[1].visited = true;
			 Dfs(nodes[1]);
			
			for(int answer : parent) {
				if(answer == 0) continue;
				sb.append(answer).append("\n");				
			}
			System.out.println(sb);
		}
	

	private static void Dfs(Node8 node8) {
		List<Node8> list = node8.getSide();
			
		
		for(Node8 n : list) {
			if(!n.visited) {
				n.visited = true;
				parent[n.info] = node8.info;
				Dfs(n);
			}
		}
	
	}
}

class Node8 {
	int info;
	boolean visited;
	List<Node8> neighbor;
	
	
	Node8(int info) {
		this.info = info;
		this.visited = false;
		this.neighbor = new ArrayList<Node8>();
	}
	
	public void addSide(Node8 n) {
		this.neighbor.add(n);
	}
	public List<Node8> getSide() {
		return this.neighbor;
	}
}