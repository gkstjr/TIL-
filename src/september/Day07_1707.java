package september;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

import javax.xml.soap.Node;


public class Day07_1707 {
		static String ans;
	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine());
		
		for(int t = 0 ; t < T; t++) {
			st = new StringTokenizer(br.readLine());
			int v = Integer.parseInt(st.nextToken());
			int e = Integer.parseInt(st.nextToken());
			Node1707[] nodes = new Node1707[v + 1];
			//노드 정보 넣어주
			for(int i = 0; i < v + 1;i++) {
				nodes[i] = new Node1707(i);
			}
			//인접 노드 설정해주기
			for(int i = 0; i < e; i++) {
				st= new StringTokenizer(br.readLine());
				int a = Integer.parseInt(st.nextToken());
				int b = Integer.parseInt(st.nextToken());
				
				nodes[a].addSide(nodes[b]);
				nodes[b].addSide(nodes[a]);
			}
			nodes[1].color = 1;
			for(int i = 1 ; i < v + 1; i++) {
				if(ans != null && ans.equals("NO")) break;
				Dfs(nodes[i]);
			}
			if(ans != null && ans.equals("NO")) {
				System.out.println(ans);				
			}else {
				System.out.println("YES");
			}
			reset(nodes);
		}
	}
	
	static void reset(Node1707[] nodes) {
		for(Node1707 n : nodes) {
			n.visited  = false;
		}
	}
	
	static void Dfs(Node1707 node) {
		node.visited = true;
		
		List<Node1707> neighbors = node.neighbor;
		
		for(Node1707 n : neighbors) {
			if(n.visited != true) {
				if(n.color == 0) {
					if(node.color == 1) {
						n.color = -1;
						Dfs(n);
					}else {
						n.color = 1;
						Dfs(n);
					}
				}else {
					if(n.color == node.color) {
						ans = "NO";
						return;
					}else {
						Dfs(n);
					}
				}
			}
		}
	}
}

class Node1707 {
	int info;
	boolean visited;
	List<Node1707> neighbor;
	int color; // 1 과 -1로하
	Node1707(int info) {
		this.info = info;
		this.visited = false;
		this.neighbor = new ArrayList<Node1707>();
		this.color = 0;
	}
	
	void addSide(Node1707 node) {
		this.neighbor.add(node);
	}
	
}