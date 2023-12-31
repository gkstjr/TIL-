package algo.dfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Dfs5 { // 07-07 깊이우선탐색 문제 복기 중
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		Node2[] nodes = new Node2[n + 1];
		int count = 0;
		
		for(int i = 0 ; i < n + 1; i++) {
			nodes[i] =  new Node2(i);			
		}
		
		for(int i = 0; i < m; i++ ) {
			st = new StringTokenizer(br.readLine());
			
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			
			nodes[x].addSide(nodes[y]);
			nodes[y].addSide(nodes[x]);
		}
		
		for(int i = 1 ; i < n + 1; i++) {
			if(!nodes[i].visited) {
				count++;
				nodes[i].visited = true;
				Dfs(nodes[i]);
			}
		
		}
		System.out.println(count);
	}

	private static void Dfs(Node2 node) {
		List<Node2> nei = node.neighbor;
		
		for(Node2 newNode : nei ) {
			if(!newNode.visited) {
				newNode.visited = true;
				Dfs(newNode);
			}
		}
	}
	
}


class Node2 {
	int info;
	boolean visited;
	List<Node2> neighbor;
	
	Node2(int info) {
		this.info = info;
		this.visited = false;
		this.neighbor = new ArrayList<Node2>();
	}

	public void addSide(Node2 node) {
			this.neighbor.add(node);
	}
	
	
	}