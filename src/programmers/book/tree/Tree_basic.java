package programmers.book.tree;
import java.util.*;

public class Tree_basic {
	static String[] answer = new String[3];
	static String pre = "";
	public static void main(String[] args) {
		int[] nodes = {1,2,3,4,5,6,7};
		preOrder(nodes, 0);
		answer[0] = pre;
		pre = "";
		inOrder(nodes , 0);
		answer[1] = pre;
		pre = "";
		System.out.println(answer[0] + " , " + answer[1] );
	}

	public static void preOrder(int[] nodes , int idx) {
		if(idx >= nodes.length) return;
		
		if(idx != 0) {
			pre +=  " " + nodes[idx];
		}else pre += nodes[idx];
		
		preOrder(nodes , idx * 2 + 1);
		preOrder(nodes, idx * 2 + 2);
		
	}
	
	public static void inOrder(int[] nodes , int idx) {
		if(idx >= nodes.length) return;
		
		inOrder(nodes , idx * 2 + 1);
		if(idx != 3) {
			pre +=  " " + nodes[idx];
		}else pre += nodes[idx];
		inOrder(nodes , idx * 2 + 2);

	}
}
