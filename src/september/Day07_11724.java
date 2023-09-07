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


public class Day07_11724 {
	static int cnt = 0;
	public static void main(String[] args) throws IOException {
	
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		Node11724[] nodes= new Node11724[n + 1];
		
		for(int i = 0 ; i < n + 1; i++) {
			nodes[i] = new Node11724(i);
		}
		
		for(int i = 0 ; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			nodes[a].setSide(nodes[b]);
			nodes[b].setSide(nodes[a]);
		}
		
		for(int i = 1; i < n + 1 ; i ++) {
			if(nodes[i].visited == false) {
				Dfs(nodes[i]);
				cnt++;
			}
		}
	 	
		System.out.println(cnt);
		
	}	
	static void Dfs(Node11724 node) {
		node.visited = true;
		
		List<Node11724> nodes= node.neighbor;
		for(Node11724 n : nodes) {
			if(n.visited != true) {
				Dfs(n);
			}
		}
	}
}



class Node11724 {
	int info;
	boolean visited;
	List<Node11724> neighbor;
	
	Node11724(int info) {
		this.info = info;
		this.visited = false;
		this.neighbor = new ArrayList<Node11724>();
	}
	
	void setSide(Node11724 node) {
		this.neighbor.add(node);
	}
}
