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


public class Day06_1260 {
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st; 
		st = new StringTokenizer(br.readLine());;
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int start = Integer.parseInt(st.nextToken());
		
		Node1260[] nodes = new Node1260[N + 1];
		
		for(int i = 0 ; i < N + 1 ; i++) {
			nodes[i] = new Node1260(i);
		}
		
		for(int i = 0 ; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			nodes[a].addSide(nodes[b]);
			nodes[b].addSide(nodes[a]);
		}
		
		for(Node1260 n : nodes) {
			Collections.sort(n.neighbors);
		}
		
		Dfs(nodes[start]);
		sb.append("\n");
		
		reset(nodes);
		
		Bfs(nodes[start]);
		System.out.println(sb);
	}
	
	static void Dfs(Node1260 node) {
		node.visited = true;
		sb.append(node.info + " ");
		
		List<Node1260> neighbor = node.getSide();
		
		for(Node1260 nei : neighbor) {
			if(nei.visited != true) {
				Dfs(nei);				
			}
		}
	}
	
	static void reset(Node1260[] nodes){
        for(Node1260 v : nodes)
            v.visited=false;
    }

	static Queue<Node1260> que = new LinkedList<Node1260>();
	
	static void Bfs(Node1260 node) {
		node.visited = true;
		
		que.offer(node);
		sb.append(node.info + " ");
		
		while(!que.isEmpty()) {
			Node1260 nd = que.remove();
			List<Node1260> nei = nd.getSide();
			for(Node1260 no : nei) {
				if(no.visited != true) {
					no.visited = true;
					que.offer(no);
					sb.append(no.info + " ");
				}
			}
		}
		
	}
	
}


class Node1260 implements Comparable<Node1260> {
	int info;
	boolean visited;
	List<Node1260> neighbors;
	
	
	Node1260(int info) {
		this.info = info;
		this.visited = false;
		this.neighbors = new ArrayList<Node1260>();
	}
	
	void addSide(Node1260 node) {
		this.neighbors.add(node);
	}
	
	List<Node1260> getSide() {
		return neighbors;
	}

	@Override
	public int compareTo(Node1260 o) {
		
	     if (this.info > o.info) {
	            return 1;
	        } else if (this.info < o.info) {
	            return -1;
	        }
	        return 0;
	}
	
}
