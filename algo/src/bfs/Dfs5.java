package bfs; 
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;
import java.util.StringTokenizer;

class Main {
	static int count;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st;
		
		int nodeCount = Integer.parseInt(br.readLine());
		int lineCount = Integer.parseInt(br.readLine());
		
		Node[] nodes = new Node[nodeCount + 1];
		for(int i = 0 ; i < nodeCount + 1; i++) {
			nodes[i] = new Node(i);
		}
		
		for(int i = 0 ; i < lineCount; i++) {
			st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			
			nodes[N].addSide(nodes[M]);
			nodes[M].addSide(nodes[N]);
		}
	
		Dfs(nodes[1]);
		System.out.println(count - 1);
	}

	private static void Dfs(Node node) {
		count++;
		node.visited = true;  
		List<Node> list = node.neighbors;
		
		for(Node n : list) {
			if(!n.visited) {
			
				Dfs(n);
			}
		}
		
	}
}



