package codePlus;

import java.util.*;
import java.io.*;
import java.nio.Buffer;

class Node {
	String left;
	String right;
	
	public Node(String left , String right) {
		this.left = left;
		this.right = right;
	}
}

public class tree_1991 { 
	static Node[] list;
    static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		list = new Node[N + 1];
		
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			
			char str1 = st.nextToken().charAt(0);
			String str2 = st.nextToken();
			String str3 = st.nextToken();
			
			Node node = new Node(str2 , str3);
			list[str1 - 'A'] = node;
			
		}
		
		preOrder("A");
		sb.append("\n");
		inOrder("A");
		sb.append("\n");
		postOrder("A");
		System.out.println(sb);
	}
	
	static void preOrder(String n) {
		if(n.equals(".")) return;
		sb.append(n);
		preOrder(list[n.charAt(0) - 'A'].left);
		preOrder(list[n.charAt(0) - 'A'].right);
	}
	static void inOrder(String n) {
		if(n.equals(".")) return;
		inOrder(list[n.charAt(0) - 'A'].left);
		sb.append(n);
		inOrder(list[n.charAt(0) - 'A'].right);
	}
	
	static void postOrder(String n) {
		if(n.equals(".")) return;
		postOrder(list[n.charAt(0) - 'A'].left);
		postOrder(list[n.charAt(0) - 'A'].right);
		sb.append(n);
	}
 }
 