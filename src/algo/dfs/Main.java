package algo.dfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
		static int question1 , question2;
		static int count = 0;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine());
		st= new StringTokenizer(br.readLine());
		
		question1 = Integer.parseInt(st.nextToken());
		question2 = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(br.readLine());
		
		Node9[] nodes = new Node9[n + 1];
		for(int i =0 ; i < n + 1; i++) {
			nodes[i] = new Node9(i);
		}
		
		for(int i = 0 ; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			
			nodes[x].addSide(nodes[y]);
			nodes[y].addSide(nodes[x]);
			
		}
		
		count = Dfs(nodes[question1 + 1]);
		
		
		System.out.println(count);
	}

	public static int Dfs(Node9 node) {
		node.visited = true;
		count++;
		
		List<Node9> list = node.getSide();
		for(Node9 nd : list) {
			if(!nd.visited) {
				if(nd.info == question2) {
					return count;
				}
				Dfs(nd);
			}
		}
		return -1;
	}
}

class Node9 {
	int info;
	boolean visited;
	List<Node9> neighbors;
	
	
	Node9(int info) {
		this.info = info;
		this.visited = false;
		this.neighbors = new ArrayList<Node9>();
	}
	
	public void addSide(Node9 n) {
		this.neighbors.add(n);
	}
	public List<Node9> getSide() {
		return this.neighbors;
	}
}
