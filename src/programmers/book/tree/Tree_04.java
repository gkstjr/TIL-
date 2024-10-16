package programmers.book.tree;
import java.util.*;

public class Tree_04 {
	public static void main(String[] args) {
	}

	   public int[][] solution(int[][] nodeinfo) {
	        int[][] answer = {};
	        Node[] nodes = new Node[nodeinfo.length];
	        
	        for(int i = 0 ; i < nodeinfo.length; i++) {
	                    
	        }
	        
	        return answer;
	    }

	    private static class Node {
	        int x , y , num; // num은 노드번호(nodeinfo의 배열인덱스)
	        Node left , right;
	        
	        public Node(int x , int y ,int num) {
	            this.x = x;
	            this.y = y;
	            this.num = num;
	        }    
	    }
}
