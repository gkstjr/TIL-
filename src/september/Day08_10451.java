package september;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.HashMap;
import java.util.List;
import java.util.Stack;
import java.util.StringTokenizer;
import java.util.prefs.BackingStoreException;
/*

 *  'A' = 65
 * */
class Day08_10451 {
    static int cnt = 0;
	public static void main(String args[]) throws Exception {
     
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st;
    	
    	int T = Integer.parseInt(br.readLine());
    	
    	for(int t = 0; t < T; t++) {
    		int N = Integer.parseInt(br.readLine());
    		
    		Node10451[] nodes = new Node10451[N + 1];
    		
    		for(int i = 0; i < N + 1; i++) {
    			nodes[i] = new Node10451(i);
    		}
    		
    		st = new StringTokenizer(br.readLine());
    		for(int i = 1 ; i < N + 1; i++) {
    			int a = Integer.parseInt(st.nextToken());
    			nodes[i].addSide(nodes[a]);
    			nodes[a].addSide(nodes[i]);
    		}
    		
    		for(int i = 1; i < N + 1; i++) {
    			if(nodes[i].visited != true) {
    				Dfs(nodes[i]);
    				cnt++;
    			}
    		}
    		System.out.println(cnt);
    		cnt = 0;
    		reset(nodes);
    	}
    }
	static void Dfs(Node10451 node) {
		node.visited = true;
		
		List<Node10451> neighbor = node.neighbor;
		
		for(Node10451 n : neighbor) {
			if(n.visited != true) {
				Dfs(n);
			}
		}
	}
	
	static void reset(Node10451[] nodes) {
		for(Node10451 n : nodes) {
			n.visited = false;
		}
	}
}

class Node10451 {
	int info;
	boolean visited;
	List<Node10451> neighbor;
	
	Node10451(int info) {
		this.info = info;
		this.visited = false;
		this.neighbor = new ArrayList<Node10451>();
	}

	void addSide(Node10451 node) {
		this.neighbor.add(node);
	}
	
}
