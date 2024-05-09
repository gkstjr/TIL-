package colombus.week3_dfs_bfs_graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

//문제 설명 : 
//핵심 개념 : dfs / bfs 알고리즘
//예상 시간복잡도 : 
//오답노트 -> 
class Node {
	char value; //해당 노드 알파벳
	Node left; //인쪽 자식
	Node right; // 오른쪽 자식
	
	public Node(char value) {
		this.value = value;
		this.left = null;
		this.right = null;
	}
}

public class tree_1991_필수문제3 {
	static StringBuilder sb = new StringBuilder();
	static int N;
	static Node[] tree;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.valueOf(br.readLine());
		StringTokenizer st;
		tree = new Node[N];
		for(int i = 0 ; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			char parentNode = st.nextToken().charAt(0);
			char leftNode = st.nextToken().charAt(0);
			char rightNode = st.nextToken().charAt(0);
			
			if(tree[parentNode - 'A'] == null) { // 아직 부모 노드가 등록이 안되어있으면
				tree[parentNode - 'A'] = new Node(parentNode);
			}
			if(leftNode != '.') { //왼쪽 자식 노드가 있으면
				tree[leftNode - 'A'] = new Node(leftNode);
				tree[parentNode - 'A'].left = tree[leftNode - 'A'];
			}
			if(rightNode != '.') {
				tree[rightNode - 'A'] = new Node(rightNode);
				tree[parentNode - 'A'].right = tree[rightNode - 'A'];
			}
		}
		preOrder(tree[0]);
		sb.append("\n");
		inOrder(tree[0]);
		sb.append("\n");
		postOrder(tree[0]);
		System.out.println(sb);
	}
	//전위 순회
	static void preOrder(Node root) {
		if(root == null) return;
		sb.append(root.value);
		
		preOrder(root.left);
		
		preOrder(root.right);
	}
	
	//중위 순회
	static void inOrder(Node root) {
		if(root == null) return;
		
		inOrder(root.left);
		
		sb.append(root.value);
		
		inOrder(root.right);
	}
	
	//후위 순회
	static void postOrder(Node root) {
		if(root == null) return;
		
		postOrder(root.left);
				
		postOrder(root.right);
		
		sb.append(root.value);
	}
}


