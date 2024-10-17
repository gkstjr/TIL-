package programmers.book.tree;
import java.util.*;

public class Tree_05 {
	
	public static void main(String[] args) {
		int[][] arr = {{0,0,1},{0,1,2},{1,1,2}};
		int[][] arr2 = {{0,0,1},{1,1,2},{0,1,2},{1,0,2}};

		Boolean[] answer = solution(arr2 , 4);
		for(int i = 0; i < answer.length; i++) {
			System.out.println(answer[i]);
		}
	}

	public static Boolean[] solution(int[][] operations, int k) {
		ArrayList<Boolean> answer = new ArrayList<>();
		int[] nodes = new int[k];
		for(int i = 0 ; i < k; i++) {
			nodes[i] = -1;
		}
		for(int i = 0; i < operations.length; i++) {
			int oper = operations[i][0];
			int node1 = operations[i][1];
			int node2 = operations[i][2];
			
			if(oper == 0) { //union
				nodes[node1 > node2 ? node2 : node1] = node1 > node2 ? node1 : node2;
			}else { // equals;
				answer.add(find(nodes , node1 > node2 ? node1 : node2 , node1 > node2 ? node2 : node1));
			}
		}
		
		return answer.toArray(new Boolean[0]);
	}
	
	public static boolean find(int[] nodes , int node1 , int node2) {
		if(node1 == -1 || node2 == -1) return false;
		if(node1 == node2) return true;
	
		if(find(nodes , node1 , nodes[node2]) == true) return true;
		
		return false;
	}
}
