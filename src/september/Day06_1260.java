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
		
		Node[] nodes = new Node[N + 1];
		
		for(int i = 0 ; i < N + 1 ; i++) {
			nodes[i] = new Node(i);
		}
		
		for(int i = 0 ; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			nodes[a].addSide(nodes[b]);
			nodes[b].addSide(nodes[a]);
		}
		
		for(Node n : nodes) {
			Collections.sort(n.neighbors);
		}
		
		Dfs(nodes[start]);
		sb.append("\n");
		
		reset(nodes);
		
		Bfs(nodes[start]);
		System.out.println(sb);
	}
	
	static void Dfs(Node node) {
		node.visited = true;
		sb.append(node.info + " ");
		
		List<Node> neighbor = node.getSide();
		
		for(Node nei : neighbor) {
			if(nei.visited != true) {
				Dfs(nei);				
			}
		}
	}
	
	static void reset(Node[] nodes){
        for(Node v : nodes)
            v.visited=false;
    }

	static Queue<Node> que = new LinkedList<Node>();
	
	static void Bfs(Node node) {
		node.visited = true;
		
		que.offer(node);
		sb.append(node.info + " ");
		
		while(!que.isEmpty()) {
			Node nd = que.remove();
			List<Node> nei = nd.getSide();
			for(Node no : nei) {
				if(no.visited != true) {
					no.visited = true;
					que.offer(no);
					sb.append(no.info + " ");
				}
			}
		}
		
	}
	
}


class Node1260 implements Comparable<Node> {
	int info;
	boolean visited;
	List<Node> neighbors;
	
	
	Node1260(int info) {
		this.info = info;
		this.visited = false;
		this.neighbors = new ArrayList<Node>();
	}
	
	void addSide(Node node) {
		this.neighbors.add(node);
	}
	
	List<Node> getSide() {
		return neighbors;
	}

	@Override
	public int compareTo(Node o) {
		
	     if (this.info > o.info) {
	            return 1;
	        } else if (this.info < o.info) {
	            return -1;
	        }
	        return 0;
	}
	
}
